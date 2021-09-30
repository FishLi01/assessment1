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
    @Column(name = "contract_money")
    private BigDecimal contractMoney;

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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 签约时间
     */
    @Column(name = "signature_time")
    private Date signatureTime;

    /**
     * 归档时间
     */
    @Column(name = "archive_time")
    private Date archiveTime;

    /**
     * 审核人id
     */
    @Column(name = "verifier_id")
    private String verifierId;

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
     * 备注
     */
    private String remark;

    /**
     * 合同路径
     */
    @Column(name = "contract_file")
    private String contractFile;

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
     * @return contract_money - 合同金额
     */
    public BigDecimal getContractMoney() {
        return contractMoney;
    }

    /**
     * 设置合同金额
     *
     * @param contractMoney 合同金额
     */
    public void setContractMoney(BigDecimal contractMoney) {
        this.contractMoney = contractMoney;
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取归档时间
     *
     * @return archive_time - 归档时间
     */
    public Date getArchiveTime() {
        return archiveTime;
    }

    /**
     * 设置归档时间
     *
     * @param archiveTime 归档时间
     */
    public void setArchiveTime(Date archiveTime) {
        this.archiveTime = archiveTime;
    }

    /**
     * 获取审核人id
     *
     * @return verifier_id - 审核人id
     */
    public String getVerifierId() {
        return verifierId;
    }

    /**
     * 设置审核人id
     *
     * @param verifierId 审核人id
     */
    public void setVerifierId(String verifierId) {
        this.verifierId = verifierId;
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

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取合同路径
     *
     * @return contract_file - 合同路径
     */
    public String getContractFile() {
        return contractFile;
    }

    /**
     * 设置合同路径
     *
     * @param contractFile 合同路径
     */
    public void setContractFile(String contractFile) {
        this.contractFile = contractFile;
    }
}