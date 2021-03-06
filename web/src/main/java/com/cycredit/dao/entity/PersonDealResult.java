package com.cycredit.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class PersonDealResult implements Serializable {
    private Long id;

    private String description;

    private String pid;

    private String name;

    private String identityCard;

    private Long operator;

    private String operatorAreaCode;

    private String operatorDepartmentCode;

    private String dealType;

    private String tags;

    private Date updateTime;

    private Date createTime;

    private String creditType;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard == null ? null : identityCard.trim();
    }

    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    public String getOperatorAreaCode() {
        return operatorAreaCode;
    }

    public void setOperatorAreaCode(String operatorAreaCode) {
        this.operatorAreaCode = operatorAreaCode == null ? null : operatorAreaCode.trim();
    }

    public String getOperatorDepartmentCode() {
        return operatorDepartmentCode;
    }

    public void setOperatorDepartmentCode(String operatorDepartmentCode) {
        this.operatorDepartmentCode = operatorDepartmentCode == null ? null : operatorDepartmentCode.trim();
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType == null ? null : dealType.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType == null ? null : creditType.trim();
    }
}