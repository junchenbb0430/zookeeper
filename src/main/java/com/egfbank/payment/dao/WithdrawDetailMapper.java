package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.WithdrawDetail;

public interface WithdrawDetailMapper {
    int deleteByPrimaryKey(String balanceWithdarwId);

    int insert(WithdrawDetail record);

    int insertSelective(WithdrawDetail record);

    WithdrawDetail selectByPrimaryKey(String balanceWithdarwId);

    int updateByPrimaryKeySelective(WithdrawDetail record);

    int updateByPrimaryKey(WithdrawDetail record);
}