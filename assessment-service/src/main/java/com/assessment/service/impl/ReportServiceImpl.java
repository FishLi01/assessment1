package com.assessment.service.impl;

import com.assessment.mapper.ReportMapper;
import com.assessment.pojo.Report;
import com.assessment.service.ReportService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-28 9:33
 */
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;
    @Autowired
    private Sid sid;

    @Override
    public void saveReport(Report report) {
        report.setId(sid.nextShort());
        report.setCreateTime(new Date());
        report.setReportStatus(0);
        reportMapper.insert(report);
    }
}
