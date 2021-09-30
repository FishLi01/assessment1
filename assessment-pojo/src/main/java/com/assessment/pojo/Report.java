package com.assessment.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import javax.persistence.*;

@ApiModel(value = "项目报告对象",description = "项目报告对象")
public class Report {
    @ApiModelProperty(hidden = true)
    @Id
    private String id;

    /**
     * 报告编号
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "report_number")
    private Long reportNumber;

    /**
     * 报告名称
     */
    @ApiModelProperty(value = "报告名称",name = "reportName",example = "报告名称",required = true)
    @Column(name = "report_name")
    private String reportName;

    /**
     * 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "report_status")
    private Integer reportStatus;

    /**
     * 创建时间
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建报告用户ID
     */
    @ApiModelProperty(value = "创建报告用户id",name = "userId",example = "创建报告用户id",required = true)
    @Column(name = "user_id")
    private String userId;

    /**
     * 项目ID
     */
    @ApiModelProperty(value = "项目id",name = "projectId",example = "项目id",required = true)
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
     * 获取报告编号
     *
     * @return report_number - 报告编号
     */
    public Long getReportNumber() {
        return reportNumber;
    }

    /**
     * 设置报告编号
     *
     * @param reportNumber 报告编号
     */
    public void setReportNumber(Long reportNumber) {
        this.reportNumber = reportNumber;
    }

    /**
     * 获取报告名称
     *
     * @return report_name - 报告名称
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * 设置报告名称
     *
     * @param reportName 报告名称
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * 获取状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     *
     * @return report_status - 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    public Integer getReportStatus() {
        return reportStatus;
    }

    /**
     * 设置状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     *
     * @param reportStatus 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
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
     * 获取创建报告用户ID
     *
     * @return user_id - 创建报告用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置创建报告用户ID
     *
     * @param userId 创建报告用户ID
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