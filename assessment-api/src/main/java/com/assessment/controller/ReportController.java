package com.assessment.controller;

import com.assessment.pojo.Report;
import com.assessment.service.ReportService;
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
 * @date 2021-09-27 10:55
 */
@Api(value = "项目报告业务相关的接口",tags = "项目报告业务相关的controller")
@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;

    @ApiOperation(value = "项目报告创建接口",notes = "项目报告创建的接口")
    @PostMapping("/saveReport")
    public IMoocJSONResult saveReport(@RequestBody Report report){
        reportService.saveReport(report);
        return IMoocJSONResult.ok();
    }
}
