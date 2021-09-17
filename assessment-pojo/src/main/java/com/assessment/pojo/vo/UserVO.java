package com.assessment.pojo.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@ApiModel(value = "用户对象",description = "用户对象")
public class UserVO {
    @ApiModelProperty(hidden = true)
    private String id;

    @ApiModelProperty(hidden = true)
    private String userToken;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名",name = "username",example = "李一",required = true)
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "用户密码",name = "password",example = "123456",required = true)
    @JsonIgnore
    private String password;

    /**
     * 部门 0:董事 1:评估 2:财务 3:行政 4:监管 5:其他
     */
    @ApiModelProperty(value = "部门",name = "department",example = "2",required = true)
    private Integer department;

    /**
     * 职级 0:董事 1.经理 2:员工 3:助理 4:其他
     */
    @ApiModelProperty(value = "职级",name = "rank",example = "2",required = true)
    private Integer rank;

    /**
     * 状态 0:未认证 1:已认证 2:启用 3:禁用
     */
//    @ApiModelProperty(value = "状态", name = "status",example = "0",required = true)
    @ApiModelProperty(hidden = true)
    private Integer status;

    /**
     * 创建时间
     */
    @ApiModelProperty(hidden = true)
    private Date createTime;

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
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取部门 0:董事 1:评估 2:财务 3:行政 4:监管 5:其他
     *
     * @return department - 部门 0:董事 1:评估 2:财务 3:行政 4:监管 5:其他
     */
    public Integer getDepartment() {
        return department;
    }

    /**
     * 设置部门 0:董事 1:评估 2:财务 3:行政 4:监管 5:其他
     *
     * @param department 部门 0:董事 1:评估 2:财务 3:行政 4:监管 5:其他
     */
    public void setDepartment(Integer department) {
        this.department = department;
    }

    /**
     * 获取职级 0:董事 1.经理 2:员工 3:助理 4:其他
     *
     * @return rank - 职级 0:董事 1.经理 2:员工 3:助理 4:其他
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置职级 0:董事 1.经理 2:员工 3:助理 4:其他
     *
     * @param rank 职级 0:董事 1.经理 2:员工 3:助理 4:其他
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * 获取状态 0:未认证 1:已认证 2:启用 3:禁用
     *
     * @return status - 状态 0:未认证 1:已认证 2:启用 3:禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0:未认证 1:已认证 2:启用 3:禁用
     *
     * @param status 状态 0:未认证 1:已认证 2:启用 3:禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
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

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}