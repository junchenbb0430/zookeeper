package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.PayDetail;

public interface PayDetailMapper {
    int deleteByPrimaryKey(String paymentBalanceId);

    int insert(PayDetail record);

    int insertSelective(PayDetail record);

    PayDetail selectByPrimaryKey(String paymentBalanceId);

    int updateByPrimaryKeySelective(PayDetail record);

    int updateByPrimaryKey(PayDetail record);
}