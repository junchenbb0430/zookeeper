package com.egfbank.payment.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    private String paymentId;

    private String orderId;

    private String payChannel;

    private String detailOwner;

    private BigDecimal payAmount;

    private String freezeCode;

    private BigDecimal unfreezeAmount;

    private BigDecimal freezeAmount;

    private String detailStatus;

    private String errorCode;

    private Date createTime;

    private Date updateTime;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId == null ? null : paymentId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getDetailOwner() {
        return detailOwner;
    }

    public void setDetailOwner(String detailOwner) {
        this.detailOwner = detailOwner == null ? null : detailOwner.trim();
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getFreezeCode() {
        return freezeCode;
    }

    public void setFreezeCode(String freezeCode) {
        this.freezeCode = freezeCode == null ? null : freezeCode.trim();
    }

    public BigDecimal getUnfreezeAmount() {
        return unfreezeAmount;
    }

    public void setUnfreezeAmount(BigDecimal unfreezeAmount) {
        this.unfreezeAmount = unfreezeAmount;
    }

    public BigDecimal getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(BigDecimal freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public String getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus == null ? null : detailStatus.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}