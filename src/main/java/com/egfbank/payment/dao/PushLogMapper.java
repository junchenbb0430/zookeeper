package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.PushLog;

public interface PushLogMapper {
    int deleteByPrimaryKey(String transId);

    int insert(PushLog record);

    int insertSelective(PushLog record);

    PushLog selectByPrimaryKey(String transId);

    int updateByPrimaryKeySelective(PushLog record);

    int updateByPrimaryKey(PushLog record);
}