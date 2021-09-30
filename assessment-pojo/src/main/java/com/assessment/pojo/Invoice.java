package com.assessment.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import javax.persistence.*;
@ApiModel(value = "发票对象",description = "发票对象")
public class Invoice {
    @ApiModelProperty(hidden = true)
    @Id
    private String id;

    /**
     * 发票编号
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "invoice_number")
    private Long invoiceNumber;

    /**
     * 单位名称
     */
    @ApiModelProperty(value = "单位名称",name = "buyer",example = "单位名称",required = true)
    private String buyer;

    /**
     * 纳税人识别号
     */
    @ApiModelProperty(value = "纳税人识别号",name = "taxpayer",example = "纳税人识别号",required = true)
    private String taxpayer;

    /**
     * 电话及地址
     */
    @ApiModelProperty(value = "电话及地址",name = "addressTelephone",example = "电话及地址",required = true)
    @Column(name = "address_telephone")
    private String addressTelephone;

    /**
     * 开户行及银行账号
     */
    @ApiModelProperty(value = "开户行及银行账号",name = "depositBank",example = "开户行及银行账号",required = true)
    @Column(name = "deposit_bank")
    private String depositBank;

    /**
     * 发票类型 0:普通发票 1:专用发票
     */
    @ApiModelProperty(value = "发票类型 0:普通发票 1:专用发票",name = "invoiceType",example = "发票类型 0:普通发票 1:专用发票",required = true)
    @Column(name = "invoice_type")
    private Integer invoiceType;

    /**
     * 发票金额
     */
    @ApiModelProperty(value = "发票金额",name = "invoiceMoney",example = "发票金额",required = true)
    @Column(name = "invoice_money")
    private BigDecimal invoiceMoney;

    /**
     * 状态 0:上传 1:待审核 2:审核中 3:开票 4:退回 5:作废 6:完成
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "invoice_status")
    private Integer invoiceStatus;

    /**
     * 创建发票用户ID
     */
    @ApiModelProperty(value = "创建发票用户ID",name = "userId",example = "创建发票用户ID",required = true)
    @Column(name = "user_id")
    private String userId;

    /**
     * 项目ID
     */
    @ApiModelProperty(value = "项目ID",name = "projectId",example = "项目ID",required = true)
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
     * 获取发票编号
     *
     * @return invoice_number - 发票编号
     */
    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * 设置发票编号
     *
     * @param invoiceNumber 发票编号
     */
    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * 获取单位名称
     *
     * @return buyer - 单位名称
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * 设置单位名称
     *
     * @param buyer 单位名称
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * 获取纳税人识别号
     *
     * @return taxpayer - 纳税人识别号
     */
    public String getTaxpayer() {
        return taxpayer;
    }

    /**
     * 设置纳税人识别号
     *
     * @param taxpayer 纳税人识别号
     */
    public void setTaxpayer(String taxpayer) {
        this.taxpayer = taxpayer;
    }

    /**
     * 获取电话及地址
     *
     * @return address_telephone - 电话及地址
     */
    public String getAddressTelephone() {
        return addressTelephone;
    }

    /**
     * 设置电话及地址
     *
     * @param addressTelephone 电话及地址
     */
    public void setAddressTelephone(String addressTelephone) {
        this.addressTelephone = addressTelephone;
    }

    /**
     * 获取开户行及银行账号
     *
     * @return deposit_bank - 开户行及银行账号
     */
    public String getDepositBank() {
        return depositBank;
    }

    /**
     * 设置开户行及银行账号
     *
     * @param depositBank 开户行及银行账号
     */
    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    /**
     * 获取发票类型 0:普通发票 1:专用发票
     *
     * @return invoice_type - 发票类型 0:普通发票 1:专用发票
     */
    public Integer getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型 0:普通发票 1:专用发票
     *
     * @param invoiceType 发票类型 0:普通发票 1:专用发票
     */
    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 获取发票金额
     *
     * @return invoice_money - 发票金额
     */
    public BigDecimal getInvoiceMoney() {
        return invoiceMoney;
    }

    /**
     * 设置发票金额
     *
     * @param invoiceMoney 发票金额
     */
    public void setInvoiceMoney(BigDecimal invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    /**
     * 获取状态 0:上传 1:待审核 2:审核中 3:开票 4:退回 5:作废 6:完成
     *
     * @return invoice_status - 状态 0:上传 1:待审核 2:审核中 3:开票 4:退回 5:作废 6:完成
     */
    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * 设置状态 0:上传 1:待审核 2:审核中 3:开票 4:退回 5:作废 6:完成
     *
     * @param invoiceStatus 状态 0:上传 1:待审核 2:审核中 3:开票 4:退回 5:作废 6:完成
     */
    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * 获取创建发票用户ID
     *
     * @return user_id - 创建发票用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置创建发票用户ID
     *
     * @param userId 创建发票用户ID
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