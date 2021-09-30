package com.assessment.service.impl;

import com.assessment.mapper.ContractMapper;
import com.assessment.pojo.Contract;
import com.assessment.service.ContractService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-27 9:46
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractMapper contractMapper;
    @Autowired
    private Sid sid;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveContract(Contract contract) {
        String contractid = sid.nextShort();
        contract.setId(contractid);
        contractMapper.insert(contract);

    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void updateContract(Contract contract) {
        Example contractExample = new Example(Contract.class);
        Criteria criteria = contractExample.createCriteria();
        criteria.andEqualTo("id", contract.getId());
        criteria.andEqualTo("userId", contract.getUserId());
        contractMapper.updateByExampleSelective(contract, contractExample);
    }
}
