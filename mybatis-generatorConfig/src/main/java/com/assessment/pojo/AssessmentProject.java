package com.assessment.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "assessment_project")
public class AssessmentProject {
    @Id
    private String id;

    /**
     * 项目编号
     */
    @Column(name = "project_number")
    private Long projectNumber;

    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 委托方
     */
    private String client;

    /**
     * 0:待执行 1:执行中 2:终止 3:已完成
     */
    @Column(name = "project_status")
    private Integer projectStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 起始时间
     */
    @Column(name = "starting_time")
    private Date startingTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 应收金额
     */
    @Column(name = "amount_receivable")
    private BigDecimal amountReceivable;

    /**
     * 已收金额
     */
    @Column(name = "amount_received")
    private BigDecimal amountReceived;

    /**
     * 未收金额
     */
    @Column(name = "outstanding_amount")
    private BigDecimal outstandingAmount;

    /**
     * 付款公司
     */
    @Column(name = "payment_company")
    private String paymentCompany;

    /**
     * 创建项目用户ID
     */
    @Column(name = "user_id")
    private String userId;

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
     * 获取项目编号
     *
     * @return project_number - 项目编号
     */
    public Long getProjectNumber() {
        return projectNumber;
    }

    /**
     * 设置项目编号
     *
     * @param projectNumber 项目编号
     */
    public void setProjectNumber(Long projectNumber) {
        this.projectNumber = projectNumber;
    }

    /**
     * 获取项目名称
     *
     * @return project_name - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取委托方
     *
     * @return client - 委托方
     */
    public String getClient() {
        return client;
    }

    /**
     * 设置委托方
     *
     * @param client 委托方
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * 获取0:待执行 1:执行中 2:终止 3:已完成
     *
     * @return project_status - 0:待执行 1:执行中 2:终止 3:已完成
     */
    public Integer getProjectStatus() {
        return projectStatus;
    }

    /**
     * 设置0:待执行 1:执行中 2:终止 3:已完成
     *
     * @param projectStatus 0:待执行 1:执行中 2:终止 3:已完成
     */
    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
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
     * 获取起始时间
     *
     * @return starting_time - 起始时间
     */
    public Date getStartingTime() {
        return startingTime;
    }

    /**
     * 设置起始时间
     *
     * @param startingTime 起始时间
     */
    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取应收金额
     *
     * @return amount_receivable - 应收金额
     */
    public BigDecimal getAmountReceivable() {
        return amountReceivable;
    }

    /**
     * 设置应收金额
     *
     * @param amountReceivable 应收金额
     */
    public void setAmountReceivable(BigDecimal amountReceivable) {
        this.amountReceivable = amountReceivable;
    }

    /**
     * 获取已收金额
     *
     * @return amount_received - 已收金额
     */
    public BigDecimal getAmountReceived() {
        return amountReceived;
    }

    /**
     * 设置已收金额
     *
     * @param amountReceived 已收金额
     */
    public void setAmountReceived(BigDecimal amountReceived) {
        this.amountReceived = amountReceived;
    }

    /**
     * 获取未收金额
     *
     * @return outstanding_amount - 未收金额
     */
    public BigDecimal getOutstandingAmount() {
        return outstandingAmount;
    }

    /**
     * 设置未收金额
     *
     * @param outstandingAmount 未收金额
     */
    public void setOutstandingAmount(BigDecimal outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    /**
     * 获取付款公司
     *
     * @return payment_company - 付款公司
     */
    public String getPaymentCompany() {
        return paymentCompany;
    }

    /**
     * 设置付款公司
     *
     * @param paymentCompany 付款公司
     */
    public void setPaymentCompany(String paymentCompany) {
        this.paymentCompany = paymentCompany;
    }

    /**
     * 获取创建项目用户ID
     *
     * @return user_id - 创建项目用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置创建项目用户ID
     *
     * @param userId 创建项目用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}