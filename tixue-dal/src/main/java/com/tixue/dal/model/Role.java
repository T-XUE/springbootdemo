package com.tixue.dal.model;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Integer roleId;

    private String roleCode;

    private String roleName;

    private Integer roleParentId;

    private String roleNote;

    private String userBizType;

    private Date rowAddTime;

    private Date rowUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleParentId() {
        return roleParentId;
    }

    public void setRoleParentId(Integer roleParentId) {
        this.roleParentId = roleParentId;
    }

    public String getRoleNote() {
        return roleNote;
    }

    public void setRoleNote(String roleNote) {
        this.roleNote = roleNote == null ? null : roleNote.trim();
    }

    public String getUserBizType() {
        return userBizType;
    }

    public void setUserBizType(String userBizType) {
        this.userBizType = userBizType == null ? null : userBizType.trim();
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
        sb.append(", roleId=").append(roleId);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleParentId=").append(roleParentId);
        sb.append(", roleNote=").append(roleNote);
        sb.append(", userBizType=").append(userBizType);
        sb.append(", rowAddTime=").append(rowAddTime);
        sb.append(", rowUpdateTime=").append(rowUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}