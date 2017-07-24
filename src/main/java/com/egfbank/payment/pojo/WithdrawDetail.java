package com.egfbank.payment.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WithdrawDetail {
    private String balanceWithdarwId;

    private String withdrawId;

    private String accountNo;

    private BigDecimal payAmount;

    private String transCode;

    private String payCur;

    private String status;

    private String errorCode;

    private String transId;

    private Date createTime;

    private Date updateTime;

    public String getBalanceWithdarwId() {
        return balanceWithdarwId;
    }

    public void setBalanceWithdarwId(String balanceWithdarwId) {
        this.balanceWithdarwId = balanceWithdarwId == null ? null : balanceWithdarwId.trim();
    }

    public String getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId == null ? null : withdrawId.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getPayCur() {
        return payCur;
    }

    public void setPayCur(String payCur) {
        this.payCur = payCur == null ? null : payCur.trim();
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

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
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