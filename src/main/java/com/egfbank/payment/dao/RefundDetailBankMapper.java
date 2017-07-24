package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.RefundDetailBank;

public interface RefundDetailBankMapper {
    int deleteByPrimaryKey(String bankRefundId);

    int insert(RefundDetailBank record);

    int insertSelective(RefundDetailBank record);

    RefundDetailBank selectByPrimaryKey(String bankRefundId);

    int updateByPrimaryKeySelective(RefundDetailBank record);

    int updateByPrimaryKey(RefundDetailBank record);
}