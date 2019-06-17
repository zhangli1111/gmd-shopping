package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.TypeOne;
import com.springcloud.entity.TypeTwo;
import com.springcloud.service.TypeService;
import com.springcloud.vo.ResultValue;

/**
 *  һ�������������Ŀ�����
 * @author ZHANGLI
 *
 */
@RestController
@RequestMapping("type")
public class TypeController {
   
	@Autowired
	private TypeService typeService;
	
	/**
	 *  ��ѯ���е��Լ������Ϣ
	 * @return
	 */
	@RequestMapping(value="/selectAll")
	public ResultValue selectAll() {
		ResultValue rv= new ResultValue();
		
		try {
			//����service��Ӧ�ķ�����ѯ����һ��������Ϣ�������ֲ�ѯ�Ľ��
			List<TypeOne> selectAllTypeOne = this.typeService.selectAllTypeOne();
			//�����ѯ�ɹ�
			if(selectAllTypeOne!=null && selectAllTypeOne.size()>0) {
				//���ý����״̬���Ϊ0
				rv.setCode(0);
				//����map����
				Map<String,Object> map =new HashMap<>();
				//����ѯ������뵽map������
				map.put("typeOneList", selectAllTypeOne);
				//��map���ϴ���ResultValue������
				rv.setDataMap(map);
				//����ResultValue����
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
	
	@RequestMapping(value="/selectById")
	public ResultValue selectById(@RequestParam("typeOneId") Integer typeOneId) {
		ResultValue rv= new ResultValue();
		
		try {
			//����service��Ӧ�ķ�����ѯ����һ��������Ϣ�������ֲ�ѯ�Ľ��
			List<TypeTwo> selectTypeTwoByTypeOneId = this.typeService.selectTypeTwoByTypeOneId(typeOneId);
			//�����ѯ�ɹ�
			if(selectTypeTwoByTypeOneId!=null && selectTypeTwoByTypeOneId.size()>0) {
			//���ý����״̬���Ϊ0
				rv.setCode(0);
			//����map����
				Map<String,Object> map =new HashMap<>();
			//����ѯ������뵽map������
				map.put("typeTwoList", selectTypeTwoByTypeOneId);
			//��map���ϴ���ResultValue������
				rv.setDataMap(map);
			//����ResultValue����
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
}
