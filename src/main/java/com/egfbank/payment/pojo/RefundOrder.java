package com.egfbank.payment.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RefundOrder {
    private String refundId;

    private String payorderId;

    private String bizProduct;

    private String bizType;

    private String merchantNo;

    private String bizNo;

    private String refundAccount;

    private String receiveAccount;

    private BigDecimal refundAmount;

    private String refundMemo;

    private Date refundDate;

    private String transCur;

    private String payTool;

    private String channel;

    private String status;

    private String merchantId;

    private String instChannel;

    private String billInfo;

    private String tradeNo;

    private Date gmtCreate;

    private Date gmtModified;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public String getPayorderId() {
        return payorderId;
    }

    public void setPayorderId(String payorderId) {
        this.payorderId = payorderId == null ? null : payorderId.trim();
    }

    public String getBizProduct() {
        return bizProduct;
    }

    public void setBizProduct(String bizProduct) {
        this.bizProduct = bizProduct == null ? null : bizProduct.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo == null ? null : bizNo.trim();
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount == null ? null : refundAccount.trim();
    }

    public String getReceiveAccount() {
        return receiveAccount;
    }

    public void setReceiveAccount(String receiveAccount) {
        this.receiveAccount = receiveAccount == null ? null : receiveAccount.trim();
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundMemo() {
        return refundMemo;
    }

    public void setRefundMemo(String refundMemo) {
        this.refundMemo = refundMemo == null ? null : refundMemo.trim();
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public String getTransCur() {
        return transCur;
    }

    public void setTransCur(String transCur) {
        this.transCur = transCur == null ? null : transCur.trim();
    }

    public String getPayTool() {
        return payTool;
    }

    public void setPayTool(String payTool) {
        this.payTool = payTool == null ? null : payTool.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getInstChannel() {
        return instChannel;
    }

    public void setInstChannel(String instChannel) {
        this.instChannel = instChannel == null ? null : instChannel.trim();
    }

    public String getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(String billInfo) {
        this.billInfo = billInfo == null ? null : billInfo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}