package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.Payment;

public interface PaymentMapper {
    int deleteByPrimaryKey(String paymentId);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(String paymentId);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}