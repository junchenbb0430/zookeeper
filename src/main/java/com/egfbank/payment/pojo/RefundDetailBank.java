package com.egfbank.payment.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RefundDetailBank {
    private String bankRefundId;

    private String refundorderId;

    private String payChannel;

    private String financeChannel;

    private BigDecimal transAmount;

    private String transCurs;

    private String bankTransno;

    private String accountNo;

    private String transCode;

    private BigDecimal refundAmount;

    private String bankInfo;

    private BigDecimal chargeAmount;

    private String depositNo;

    private String refundStatus;

    private String errorCode;

    private Date createTime;

    private Date updateTime;

    public String getBankRefundId() {
        return bankRefundId;
    }

    public void setBankRefundId(String bankRefundId) {
        this.bankRefundId = bankRefundId == null ? null : bankRefundId.trim();
    }

    public String getRefundorderId() {
        return refundorderId;
    }

    public void setRefundorderId(String refundorderId) {
        this.refundorderId = refundorderId == null ? null : refundorderId.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getFinanceChannel() {
        return financeChannel;
    }

    public void setFinanceChannel(String financeChannel) {
        this.financeChannel = financeChannel == null ? null : financeChannel.trim();
    }

    public BigDecimal getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    public String getTransCurs() {
        return transCurs;
    }

    public void setTransCurs(String transCurs) {
        this.transCurs = transCurs == null ? null : transCurs.trim();
    }

    public String getBankTransno() {
        return bankTransno;
    }

    public void setBankTransno(String bankTransno) {
        this.bankTransno = bankTransno == null ? null : bankTransno.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo == null ? null : bankInfo.trim();
    }

    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getDepositNo() {
        return depositNo;
    }

    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo == null ? null : depositNo.trim();
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
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