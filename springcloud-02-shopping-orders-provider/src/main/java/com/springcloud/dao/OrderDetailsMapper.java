package com.springcloud.dao;

import com.springcloud.entity.OrderDetails;
import java.util.List;

public interface OrderDetailsMapper {
    int deleteByPrimaryKey(Integer orderDetailId);

    int insert(OrderDetails record);

    OrderDetails selectByPrimaryKey(Integer orderDetailId);

    List<OrderDetails> selectAll();

    int updateByPrimaryKey(OrderDetails record);
    /**
     *  ��ѯָ��������ŵĶ�����ϸ��Ϣ
     * @param orderId �������
     * @return �ɹ�����java.util.List�����ͣ����򷵻�null
     */
    public abstract List<OrderDetails> selectByOrderId(Integer orderId);
}