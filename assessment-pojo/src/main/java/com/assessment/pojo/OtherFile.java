package com.assessment.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import javax.persistence.*;
@ApiModel(value = "项目其他文档对象",description = "项目其他文档的对象")
@Table(name = "other_file")
public class OtherFile {
    @ApiModelProperty(hidden = true)
    @Id
    private String id;

    /**
     * 其他文件编号
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "file_number")
    private Long fileNumber;

    /**
     * 其他文件名称
     */
    @ApiModelProperty(value = "其他文档名称",name = "fileName",example = "其他文档名称",required = true)
    @Column(name = "file_name")
    private String fileName;

    /**
     * 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "file_status")
    private Integer fileStatus;

    /**
     * 创建时间
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建其他文件用户ID
     */
    @ApiModelProperty(value = "创建其他文档用户id",name = "userId",example = "创建其他文档用户id",required = true)
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
     * 获取其他文件编号
     *
     * @return file_number - 其他文件编号
     */
    public Long getFileNumber() {
        return fileNumber;
    }

    /**
     * 设置其他文件编号
     *
     * @param fileNumber 其他文件编号
     */
    public void setFileNumber(Long fileNumber) {
        this.fileNumber = fileNumber;
    }

    /**
     * 获取其他文件名称
     *
     * @return file_name - 其他文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置其他文件名称
     *
     * @param fileName 其他文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     *
     * @return file_status - 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    public Integer getFileStatus() {
        return fileStatus;
    }

    /**
     * 设置状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     *
     * @param fileStatus 状态 0:上传 1:待审核 2:审核中 3:归档 4:退回 5:作废 6:完成
     */
    public void setFileStatus(Integer fileStatus) {
        this.fileStatus = fileStatus;
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
     * 获取创建其他文件用户ID
     *
     * @return user_id - 创建其他文件用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置创建其他文件用户ID
     *
     * @param userId 创建其他文件用户ID
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