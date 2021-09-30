package com.assessment.controller;

import com.assessment.pojo.Contract;
import com.assessment.service.ContractService;
import com.assessment.utils.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.IOUtils;

import java.io.*;
import java.util.Date;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-27 9:24
 */
@Api(value = "项目合同业务相关的接口",tags = "项目合同业务相关的controller")
@RestController
public class ContractController {

    @Autowired
    private ContractService contractService;


    @ApiOperation(value = "创建项目合同接口",notes = "创建项目合同的接口")
    @PostMapping("/saveContract")
    public IMoocJSONResult saveContract(@RequestBody Contract contract){
        contract.setCreateTime(new Date());
        contract.setContractStatus(0);
        contractService.saveContract(contract);
        return IMoocJSONResult.ok();
    }

    @ApiOperation(value = "上传项目合同",notes = "上传项目合同的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "用户id",name = "userId",required = true,
                    dataType = "String", paramType = "query"),
            @ApiImplicitParam(value = "合同id",name = "contractId",required = true,
                    dataType = "String",paramType = "query")
    })
    @PostMapping("/uploadFace")
    public IMoocJSONResult uploadFace(String userId,String contractId, @RequestParam("file")MultipartFile[] files) throws IOException {
        //文件保存的头信息
        String fileSpace = "D:/FISHLI/assessment-file";
        //保存到数据库的相对路径
        String uploadPathDB = "/"+userId+"/contract/";

        FileOutputStream fileOutputStream = null;
        InputStream inputStream = null;
        try {
            if (files != null && files.length > 0){

                String fileName = files[0].getOriginalFilename();
                if (StringUtils.isNotBlank(fileName)){
                    //文件上传的最终保存路径
                    String finalFacePath = fileSpace + uploadPathDB +fileName;
                    //设置数据库保存的路径
                    uploadPathDB += fileName;

                    File outFile = new File(finalFacePath);
                    if (outFile.getParentFile() != null || !outFile.getParentFile().isDirectory()){
                        //创建父文件夹
                        outFile.getParentFile().mkdirs();
                    }

                    fileOutputStream = new FileOutputStream(outFile);
                    inputStream = files[0].getInputStream();
                    org.apache.commons.io.IOUtils.copy(inputStream,fileOutputStream);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }
        Contract contract = new Contract();
        contract.setId(contractId);
        contract.setUserId(userId);
        contract.setContractFile(uploadPathDB);
        contractService.updateContract(contract);


        return IMoocJSONResult.ok(uploadPathDB);
    }

}
