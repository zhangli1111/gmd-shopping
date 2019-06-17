package com.springcloud.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Goods;

/**
 *  ��Ʒģ�Ͳ㣺���ڶ������Ʒģ����в����ķ���
 * @author ZHANGLI
 *
 */
public interface GoodsService {
	/**
	 *   ����µ���Ʒ��Ϣ
	 * @param goods  ����Ʒ��Ϣ
	 * @return  �ɹ����ش���0�����������򷵻�0
	 */ 
	public abstract Integer insert(Goods goods);
	
	/**
	 *   ��ѯ������������Ʒ��Ϣ����ҳ���ܣ�
	 * @param goods  ��ѯ����
	 * @param pageNumber  ҳ��
	 * @return �ɹ�����com.github.pagehelper.PageInfo<Goods>���͵�ʵ�������򷵻�null
	 */
	public abstract PageInfo<Goods> select(Goods goods,Integer pageNumber);
	
	/**
	 *  ���������޸���Ʒ��Ϣ
	 * @param goods �޸���Ʒ����Ϣ
	 * @return �ɹ����ش���0�����������򷵻�С�ڵ���0������
	 */
	public abstract Integer updateGoodsById(Goods goods);
	
	/**
	 *    �޸�ָ�������Ʒ����Ϣ
	 * @param goods  �޸ĵ���Ʒ��Ϣ
	 * @return  �ɹ����ش���0�����������򷵻�С�ڵ���0������
	 */
	public abstract Integer update(Goods goods);
	/**
	 * ��ѯ����ǰ10����Ʒ��Ϣ
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<Goods> selectGroup();
	
	
}
