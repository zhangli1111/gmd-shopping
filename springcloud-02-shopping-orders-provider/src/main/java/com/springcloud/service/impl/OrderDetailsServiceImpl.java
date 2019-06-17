package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.dao.OrderDetailsMapper;
import com.springcloud.entity.OrderDetails;
import com.springcloud.service.OrderDetailsService;

/**
 * ������ϸģ��ģ�Ͳ��ʵ���࣬����ʵ�ֶ�����ϸģ��ķ���
 * @author zhangli
 *
 */
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
	@Autowired
	private OrderDetailsMapper orderDetailsMapper;
	@Override
	public PageInfo<OrderDetails> selectByOrderId(Integer orderId, Integer pageNumber) {
		
		//���÷�ҳ����Ϣ
		PageHelper.startPage(pageNumber+1,5);
		//��ѯָ��������ŵĶ�����ϸ��Ϣ
		List<OrderDetails> list = this.orderDetailsMapper.selectByOrderId(orderId);
		
		
		return new PageInfo<>(list);
	}

}
