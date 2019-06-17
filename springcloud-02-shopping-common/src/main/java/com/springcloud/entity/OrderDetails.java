package com.springcloud.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails implements java.io.Serializable {

	private static final long serialVersionUID = -6464103781453419950L;
	/**
	 * ������ϸ���
	 */
	private Integer orderDetailId;
	/**
	 * �������
	 */
	private Integer orderId;
	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;
	/**
	 * ��Ʒ����
	 */
	private String goodsName;
	/**
	 * �ɽ���
	 */
	private Double goodsFinalPrice;
	/**
	 * �ɽ�����
	 */
	private Integer goodsFinalNum;
	
	

}