package com.tixue.dal.model;

import java.io.Serializable;
import java.util.Date;

public class UserRole implements Serializable {
    private Long userRoleId;

    private Long userId;

    private Integer roleId;

    private Date rowAddTime;

    private Date rowUpdateTime;

    private static final long serialVersionUID = 1L;

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getRowAddTime() {
        return rowAddTime;
    }

    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRoleId=").append(userRoleId);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", rowAddTime=").append(rowAddTime);
        sb.append(", rowUpdateTime=").append(rowUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}