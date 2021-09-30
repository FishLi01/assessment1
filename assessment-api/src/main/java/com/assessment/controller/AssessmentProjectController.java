package com.assessment.controller;

import com.assessment.pojo.AssessmentProject;
import com.assessment.service.AssessmentProjectService;
import com.assessment.utils.IMoocJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-17 15:13
 */

@Api(value = "项目月误操作接口",tags = "项目业务操作的controller")
@RestController
public class AssessmentProjectController{

    @Autowired
    private AssessmentProjectService assessmentProjectService;
    @ApiOperation(value = "创建项目接口",notes = "创建项目的接口")
    @PostMapping("/saveAssessmentProject")
    public IMoocJSONResult saveAssessmentProject(@RequestBody AssessmentProject assessmentProject){
        assessmentProject.setProjectStatus(0);
        assessmentProject.setCreateTime(new Date());
        assessmentProject.setAmountReceived(BigDecimal.valueOf(0));
        assessmentProject.setOutstandingAmount(assessmentProject.getAmountReceivable().subtract(assessmentProject.getAmountReceived()));
        assessmentProjectService.saveAssProject(assessmentProject);
        return IMoocJSONResult.ok();
    }
}
