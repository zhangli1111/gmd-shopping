package com.springcloud.dao;

import com.springcloud.entity.TypeTwo;
import java.util.List;

public interface TypeTwoMapper {
	int deleteByPrimaryKey(Integer typeTwoId);

	int insert(TypeTwo record);

	TypeTwo selectByPrimaryKey(Integer typeTwoId);

	List<TypeTwo> selectAll();

	int updateByPrimaryKey(TypeTwo record);

	/**
	 * ��ѯTYPE_TWO����ָ��TYPE_ONE_ID�Ķ��������Ϣ
	 * 
	 * @param typeOneId һ�������
	 * @return �ɹ�����java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<TypeTwo> selectByTypeOneId(Integer typeOneId);
}