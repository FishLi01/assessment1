package com.assessment.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Contract {
    @Id
    private String id;

    /**
     * 合同编号
     */
    @Column(name = "contract_number")
    private Long contractNumber;

    /**
     * 合同名称
     */
    @Column(name = "contract_name")
    private String contractName;

    /**
     * 合同金额
     */
    @Column(name = "contract_amount")
    private BigDecimal contractAmount;

    /**
     * 合同份数
     */
    @Column(name = "contract_copies")
    private Integer contractCopies;

    /**
     * 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    @Column(name = "contract_status")
    private Integer contractStatus;

    /**
     * 签约时间
     */
    @Column(name = "signature_time")
    private Date signatureTime;

    /**
     * 创建合同用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取合同编号
     *
     * @return contract_number - 合同编号
     */
    public Long getContractNumber() {
        return contractNumber;
    }

    /**
     * 设置合同编号
     *
     * @param contractNumber 合同编号
     */
    public void setContractNumber(Long contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * 获取合同名称
     *
     * @return contract_name - 合同名称
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * 设置合同名称
     *
     * @param contractName 合同名称
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    /**
     * 获取合同金额
     *
     * @return contract_amount - 合同金额
     */
    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    /**
     * 设置合同金额
     *
     * @param contractAmount 合同金额
     */
    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    /**
     * 获取合同份数
     *
     * @return contract_copies - 合同份数
     */
    public Integer getContractCopies() {
        return contractCopies;
    }

    /**
     * 设置合同份数
     *
     * @param contractCopies 合同份数
     */
    public void setContractCopies(Integer contractCopies) {
        this.contractCopies = contractCopies;
    }

    /**
     * 获取状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     *
     * @return contract_status - 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    public Integer getContractStatus() {
        return contractStatus;
    }

    /**
     * 设置状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     *
     * @param contractStatus 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    /**
     * 获取签约时间
     *
     * @return signature_time - 签约时间
     */
    public Date getSignatureTime() {
        return signatureTime;
    }

    /**
     * 设置签约时间
     *
     * @param signatureTime 签约时间
     */
    public void setSignatureTime(Date signatureTime) {
        this.signatureTime = signatureTime;
    }

    /**
     * 获取创建合同用户ID
     *
     * @return user_id - 创建合同用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置创建合同用户ID
     *
     * @param userId 创建合同用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}