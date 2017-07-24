package com.egfbank.payment.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WithdrawDetailBank {
    private String bankWithdrawId;

    private String withdrawId;

    private String payChannel;

    private String financeChannel;

    private BigDecimal transAmount;

    private String transCurs;

    private String bankTransno;

    private String accountNo;

    private String accountName;

    private String transCode;

    private BigDecimal refundAmount;

    private String bankInfo;

    private BigDecimal chargeAmount;

    private String depositNo;

    private String status;

    private String errorCode;

    private Date createTime;

    private Date updateTime;

    public String getBankWithdrawId() {
        return bankWithdrawId;
    }

    public void setBankWithdrawId(String bankWithdrawId) {
        this.bankWithdrawId = bankWithdrawId == null ? null : bankWithdrawId.trim();
    }

    public String getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId == null ? null : withdrawId.trim();
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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