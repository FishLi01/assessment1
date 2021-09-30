package com.assessment.service;


import com.assessment.pojo.Contract;

public interface ContractService {
    //创建保存
    void saveContract(Contract contract);
    //修改
    void updateContract(Contract contract);
}
