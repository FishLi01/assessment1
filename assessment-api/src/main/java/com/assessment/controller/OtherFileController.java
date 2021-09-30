package com.assessment.controller;

import com.assessment.pojo.OtherFile;
import com.assessment.service.OtherFileService;
import com.assessment.utils.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-28 10:52
 */
@Api(value = "项目其他文档业务接口",tags = "项目其他文档业务的controller")
@RestController
public class OtherFileController {
    @Autowired
    private OtherFileService otherFileService;

    @ApiOperation(value = "创建项目其他文档接口",notes = "创建项目其他文档的接口")
    @PostMapping("/saveOtherFile")
    public IMoocJSONResult saveOtherFile(@RequestBody OtherFile otherFile){

        otherFileService.saveOtherFile(otherFile);
        return IMoocJSONResult.ok();
    }
}
