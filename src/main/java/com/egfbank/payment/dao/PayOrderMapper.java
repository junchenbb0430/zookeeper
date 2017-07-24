package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.PayOrder;

public interface PayOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(PayOrder record);

    int insertSelective(PayOrder record);

    PayOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(PayOrder record);

    int updateByPrimaryKey(PayOrder record);
}