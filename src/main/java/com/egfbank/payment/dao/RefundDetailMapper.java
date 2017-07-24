package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.RefundDetail;

public interface RefundDetailMapper {
    int deleteByPrimaryKey(String balanceRefundId);

    int insert(RefundDetail record);

    int insertSelective(RefundDetail record);

    RefundDetail selectByPrimaryKey(String balanceRefundId);

    int updateByPrimaryKeySelective(RefundDetail record);

    int updateByPrimaryKey(RefundDetail record);
}