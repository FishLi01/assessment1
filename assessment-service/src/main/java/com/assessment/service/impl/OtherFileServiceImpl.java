package com.assessment.service.impl;

import com.assessment.mapper.OtherFileMapper;
import com.assessment.pojo.OtherFile;
import com.assessment.service.OtherFileService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-28 10:57
 */
@Service
public class OtherFileServiceImpl implements OtherFileService {
    @Autowired
    private OtherFileMapper otherFileMapper;
    @Autowired
    private Sid sid;

    @Override
    public void saveOtherFile(OtherFile otherFile) {
        otherFile.setId(sid.nextShort());
        otherFile.setCreateTime(new Date());
        otherFile.setFileStatus(0);
        otherFileMapper.insert(otherFile);
    }
}
