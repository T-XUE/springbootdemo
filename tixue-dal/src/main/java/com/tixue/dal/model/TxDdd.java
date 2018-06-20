package com.tixue.dal.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "txddd")
public class TxDdd {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 人员ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 新增时间
     */
    @Column(name = "row_add_time")
    private Date rowAddTime;

    /**
     * 修改时间
     */
    @Column(name = "row_update_time")
    private Date rowUpdateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取人员ID
     *
     * @return user_id - 人员ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置人员ID
     *
     * @param userId 人员ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取新增时间
     *
     * @return row_add_time - 新增时间
     */
    public Date getRowAddTime() {
        return rowAddTime;
    }

    /**
     * 设置新增时间
     *
     * @param rowAddTime 新增时间
     */
    public void setRowAddTime(Date rowAddTime) {
        this.rowAddTime = rowAddTime;
    }

    /**
     * 获取修改时间
     *
     * @return row_update_time - 修改时间
     */
    public Date getRowUpdateTime() {
        return rowUpdateTime;
    }

    /**
     * 设置修改时间
     *
     * @param rowUpdateTime 修改时间
     */
    public void setRowUpdateTime(Date rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }
}