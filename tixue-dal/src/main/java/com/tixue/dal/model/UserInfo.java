package com.tixue.dal.model;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Long userId;

    private String userName;

    private String nickName;

    private String realName;

    private String logPassword;

    private String payPassword;

    private String accountId;

    private String accountName;

    private String mobile;

    private String mobileBinding;

    private String mail;

    private String mailBinding;

    private String type;

    private String state;

    private String realNameAuthentication;

    private Integer pwdErrorCount;

    private Date changeLockTime;

    private String birthday;

    private String userCustomType;

    private Date rowAddTime;

    private Date rowUpdateTime;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getLogPassword() {
        return logPassword;
    }

    public void setLogPassword(String logPassword) {
        this.logPassword = logPassword == null ? null : logPassword.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMobileBinding() {
        return mobileBinding;
    }

    public void setMobileBinding(String mobileBinding) {
        this.mobileBinding = mobileBinding == null ? null : mobileBinding.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getMailBinding() {
        return mailBinding;
    }

    public void setMailBinding(String mailBinding) {
        this.mailBinding = mailBinding == null ? null : mailBinding.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRealNameAuthentication() {
        return realNameAuthentication;
    }

    public void setRealNameAuthentication(String realNameAuthentication) {
        this.realNameAuthentication = realNameAuthentication == null ? null : realNameAuthentication.trim();
    }

    public Integer getPwdErrorCount() {
        return pwdErrorCount;
    }

    public void setPwdErrorCount(Integer pwdErrorCount) {
        this.pwdErrorCount = pwdErrorCount;
    }

    public Date getChangeLockTime() {
        return changeLockTime;
    }

    public void setChangeLockTime(Date changeLockTime) {
        this.changeLockTime = changeLockTime;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getUserCustomType() {
        return userCustomType;
    }

    public void setUserCustomType(String userCustomType) {
        this.userCustomType = userCustomType == null ? null : userCustomType.trim();
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
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", nickName=").append(nickName);
        sb.append(", realName=").append(realName);
        sb.append(", logPassword=").append(logPassword);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", accountId=").append(accountId);
        sb.append(", accountName=").append(accountName);
        sb.append(", mobile=").append(mobile);
        sb.append(", mobileBinding=").append(mobileBinding);
        sb.append(", mail=").append(mail);
        sb.append(", mailBinding=").append(mailBinding);
        sb.append(", type=").append(type);
        sb.append(", state=").append(state);
        sb.append(", realNameAuthentication=").append(realNameAuthentication);
        sb.append(", pwdErrorCount=").append(pwdErrorCount);
        sb.append(", changeLockTime=").append(changeLockTime);
        sb.append(", birthday=").append(birthday);
        sb.append(", userCustomType=").append(userCustomType);
        sb.append(", rowAddTime=").append(rowAddTime);
        sb.append(", rowUpdateTime=").append(rowUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}