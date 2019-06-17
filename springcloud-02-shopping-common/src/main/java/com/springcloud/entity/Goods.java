package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  GOODS���Ӧ��ʵ���࣬���ڱ�����Ʒ��Ϣ
 * @author ZHANGLI 
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable{
	
	private static final long serialVersionUID = -3427056522676684614L;
	/**
	 * ��Ʒ���
	 */
	private Integer goodsId;
	/**
	 * ��Ʒ����
	 */
	private String goodsName;
	/**
	 * ��Ʒ�۸�
	 */
	private Double goodsPrice;
	/**
	 * ��Ʒ�ۿۼ�
	 */
	private Double goodsDiscount;
	/**
	 * ��Ʒ״̬��0Ԥ�ۣ�1�����У�2�����¼�
	 */
	private Integer goodsStatus;
	/**
	 * ��Ʒ����
	 */
	private Integer goodsNum;
	/**
	 * �Ƿ���Ʒ��0����Ʒ��1������Ʒ
	 */
	private Integer goodsNew;
	/**
	 * �Ƿ�������0��������1��������
	 */
	private Integer goodsHot;
	/**
	 * ��Ʒ����0һ�ǣ�1���ǣ�2���ǣ�3���ǣ�4����
	 */
	private Integer goodsLevel;
	/**
	 * ��Ʒ���
	 */
	private String goodsDesc;
	/**
	 * ��Ʒ����
	 */
	private String goodsDetail;
	/**
	 * ��ƷͼƬ
	 */
	private String goodsImg;
	/**
	 * ���Ͷ����
	 */
	private Integer typeTwoId;
	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMin;
	/**
	 * ��ѯ��������Ʒ�۸�����
	 */
	private Double goodsPriceMax;
	/**
	 * ��ѯ����������һ���
	 */
	private Integer typeOneId;
	/**
	 * ��Ʒ�����������ڱ���ͳ�Ʒ���Ľ��
	 */
	private Integer goodsSum;
	

}