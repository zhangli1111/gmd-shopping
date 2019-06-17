package com.springcloud.service;

import java.util.List;

import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;

/**
 * ���ڶ���һ�������������ģ��ķ���
 * 
 * @author ZHANGLI
 *
 */

public interface TypeService {

	/**
	 * ��ѯ�����Լ�������Ϣ
	 * 
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<TypeOne> selectAllTypeOne();

	/**
	 * �����Լ�����Ų�ѯ��Ӧ�Ķ��������Ϣ
	 * 
	 * @param typeOneId һ�������
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<TypeTwo> selectTypeTwoByTypeOneId(Integer typeOneId);
	
	
}
