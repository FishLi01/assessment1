package com.assessment.service.impl;

import com.assessment.mapper.AssessmentProjectMapper;
import com.assessment.pojo.AssessmentProject;
import com.assessment.service.AssessmentProjectService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-17 15:24
 */
@Service
public class AssessmentProjectServiceImpl implements AssessmentProjectService {
    @Autowired
    private AssessmentProjectMapper assessmentProjectMapper;
    @Autowired
    private Sid sid;


    @Override
    public void saveAssProject(AssessmentProject assessmentProject) {
        String assId = sid.nextShort();
        assessmentProject.setId(assId);
        assessmentProjectMapper.insert(assessmentProject);
    }
}
