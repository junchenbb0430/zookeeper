package com.egfbank.payment.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class PayDetail {
    private String paymentBalanceId;

    private String paymentId;

    private String payerAccount;

    private String payeeAccount;

    private BigDecimal payAmount;

    private String transCode;

    private String payCur;

    private String accountId;

    private Date createTime;

    private Date updateTime;

    public String getPaymentBalanceId() {
        return paymentBalanceId;
    }

    public void setPaymentBalanceId(String paymentBalanceId) {
        this.paymentBalanceId = paymentBalanceId == null ? null : paymentBalanceId.trim();
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId == null ? null : paymentId.trim();
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public void setPayerAccount(String payerAccount) {
        this.payerAccount = payerAccount == null ? null : payerAccount.trim();
    }

    public String getPayeeAccount() {
        return payeeAccount;
    }

    public void setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount == null ? null : payeeAccount.trim();
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

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
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