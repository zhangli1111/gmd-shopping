package com.springcloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;
import com.springcloud.vo.ResultValue;

/**
 * ����ģ��Ŀ��Ʋ�
 * @author ����
 *
 */
@RestController
@RequestMapping("orders")
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	/**
	 *  ��ѯ���������Ķ�����Ϣ
	 * @param orders  ��ѯ����
	 * @param pageNumber ҳ��
	 * @return
	 */
	@RequestMapping(value="/selectOrders")
	public ResultValue selectOrders(Orders orders,@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		
		try {
			
			PageInfo<Orders> selectOrders = this.ordersService.selectOrders(orders, pageNumber);
			
			List<Orders> list = selectOrders.getList();
			if(list != null && list.size()>0) {
				rv.setCode(0);
				Map<String,Object> map = new HashMap<>();
				map.put("ordersList", list);
				
				PageUtils  pageUtils = new PageUtils(selectOrders.getPages()*PageUtils.PAGE_ROW_COUNT);
				pageUtils.setPageNumber(pageNumber);
				map.put("pageUtils",pageUtils);
				
				rv.setDataMap(map);
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("û���ҵ����������Ķ�����Ϣ");
		return rv;
	}
	/**
	 * �޸�ָ����Ŷ����Ķ���״̬
	 * @param orders  �޸ĵĶ�����Ϣ
	 * @return
	 */
	@RequestMapping(value="/updateOrdersStatus")
	public ResultValue updateOrdersStatus(Orders orders) {
		ResultValue rv = new ResultValue();
		
		try {
			Integer status = this.ordersService.updateOrdersStatus(orders);
			if(status >0) {
				rv.setCode(0);
				rv.setMessage("����״̬�޸ĳɹ�");
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("����״̬�޸�ʧ��");
		return rv;
	}
	
	@RequestMapping(value="/selectGroup")
	public ResultValue selectGroup(Orders orders) {
		ResultValue rv = new ResultValue();
		
		try {
			List<Orders> list = this.ordersService.selectGroup(orders);
			if(list!=null && list.size()>0) {
				rv.setCode(0);
				List<String> x=new ArrayList<>();
				List<Double> y = new ArrayList<>();
				
				for(Orders o : list) {
					x.add(o.getOrderMonth());
					y.add(o.getOrderPrice());
				}
				Map<String,Object> map = new HashMap<>();
				map.put("x", x);
				map.put("y", y);
				rv.setDataMap(map);
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(0);
		return rv;
	}

}
