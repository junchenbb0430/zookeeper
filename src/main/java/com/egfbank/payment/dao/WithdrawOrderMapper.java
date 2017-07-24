package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.WithdrawOrder;

public interface WithdrawOrderMapper {
    int deleteByPrimaryKey(String withdrawId);

    int insert(WithdrawOrder record);

    int insertSelective(WithdrawOrder record);

    WithdrawOrder selectByPrimaryKey(String withdrawId);

    int updateByPrimaryKeySelective(WithdrawOrder record);

    int updateByPrimaryKey(WithdrawOrder record);
}