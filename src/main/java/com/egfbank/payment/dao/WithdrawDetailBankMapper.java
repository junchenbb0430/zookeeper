package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.WithdrawDetailBank;

public interface WithdrawDetailBankMapper {
    int deleteByPrimaryKey(String bankWithdrawId);

    int insert(WithdrawDetailBank record);

    int insertSelective(WithdrawDetailBank record);

    WithdrawDetailBank selectByPrimaryKey(String bankWithdrawId);

    int updateByPrimaryKeySelective(WithdrawDetailBank record);

    int updateByPrimaryKey(WithdrawDetailBank record);
}