package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.dao.TypeOneMapper;
import com.springcloud.dao.TypeTwoMapper;
import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;
import com.springcloud.service.TypeService;
/**
 * ����ʵ��һ�������������ģ��ķ���
 * 
 * @author ZHANGLI
 *
 */
@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	private TypeOneMapper typeOneMapper;
	
	@Autowired
	private TypeTwoMapper typeTwoMapper;

	@Override
	public List<TypeOne> selectAllTypeOne() {
		return this.typeOneMapper.selectAll();
	}

	@Override
	public List<TypeTwo> selectTypeTwoByTypeOneId(Integer typeOneId) {
		return this.typeTwoMapper.selectByTypeOneId(typeOneId);
	}

	

}
