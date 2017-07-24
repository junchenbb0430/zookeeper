package com.egfbank.payment.dao;

import com.egfbank.payment.pojo.RefundOrder;

public interface RefundOrderMapper {
    int deleteByPrimaryKey(String refundId);

    int insert(RefundOrder record);

    int insertSelective(RefundOrder record);

    RefundOrder selectByPrimaryKey(String refundId);

    int updateByPrimaryKeySelective(RefundOrder record);

    int updateByPrimaryKey(RefundOrder record);
}