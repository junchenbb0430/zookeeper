package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.PayDetailBank;

public interface PayDetailBankMapper {
    int deleteByPrimaryKey(String paymentBankId);

    int insert(PayDetailBank record);

    int insertSelective(PayDetailBank record);

    PayDetailBank selectByPrimaryKey(String paymentBankId);

    int updateByPrimaryKeySelective(PayDetailBank record);

    int updateByPrimaryKey(PayDetailBank record);
}