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
import com.springcloud.entity.Goods;
import com.springcloud.service.GoodsService;
import com.springcloud.vo.ResultValue;

/**
 *  ��Ʒ���Ʋ�
 * @author ZHANGLI
 *
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	/**
	 *   ����µ���Ʒ��Ϣ
	 * @param goods  ����Ʒ��Ϣ
	 * @return
	 */
	@RequestMapping(value="/insert")
	public ResultValue insert(Goods goods) {
		ResultValue rv = new ResultValue();
		
		try {
			Integer insert = this.goodsService.insert(goods);
			if(insert >0) {
				rv.setCode(0);
				rv.setMessage("��Ʒ��Ϣ¼��ɹ�");
				return rv;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		rv.setCode(1);
		rv.setMessage("��Ʒ��Ϣ¼��ʧ��");
		return rv;
	}
	
	/**
	 *   ��ѯ������������Ʒ��Ϣ
	 * @param goods ��ѯ����
	 * @param pageNumber  ҳ��
	 * @return
	 */
	@RequestMapping(value="/select")
	public ResultValue select(Goods goods,@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		
		try {
			//��ѯ������������Ʒ��Ϣ
			PageInfo<Goods> pageInfo = this.goodsService.select(goods, pageNumber);
			//�ӷ�ҳ��Ϣ�л����Ʒ��Ϣ
			List<Goods> list = pageInfo.getList();
			//�����ѯ����������������Ʒ��Ϣ
			if(list != null && list.size()>0) {
				rv.setCode(0);
				
				Map<String,Object> map = new HashMap<>();
				//����Ʒ��Ϣ��ָ���ļ����뵽map������
				map.put("goodsList", list);
				PageUtils pageUtils = new PageUtils(12,pageInfo.getPages()*12);
				pageUtils.setPageNumber(pageNumber);
				//����ҳ����Ϣ��ָ�������ִ���map������
				map.put("pageUtils", pageUtils);
				
				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("û���ҵ�������������Ʒ��Ϣ");
		return rv;
	}
	
	@RequestMapping(value="/updateById")
	public ResultValue updateById(Goods goods) {
		ResultValue rv = new ResultValue();
		try {
			Integer integer = this.goodsService.updateGoodsById(goods);
			if(integer >0) {
				rv.setCode(0);
				rv.setMessage("��Ʒ��Ϣ�޸ĳɹ�");
				return rv;
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("��Ʒ��Ϣ�޸�ʧ��");
		return rv;
	}
	/**
	 *  �޸�ָ����ŵ���Ʒ��Ϣ
	 * @param goods  �޸ĵ���Ʒ��Ϣ
	 * @return
	 */
	@RequestMapping(value="/update")
	public ResultValue update(Goods goods) {
		
		ResultValue rv = new ResultValue();
		try {
			Integer update = this.goodsService.update(goods);
			if(update >0) {
				rv.setCode(0);
				rv.setMessage("��Ʒ��Ϣ�޸ĳɹ�");
				return rv;
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("��Ʒ��Ϣ�޸�ʧ��");
		return rv;
	}
	/**
	 *��ѯ����ǰ10����Ʒ��Ϣ
	 * @return
	 */
	@RequestMapping(value="/selectGroup")
	public ResultValue selectGroup() {
		ResultValue rv = new ResultValue();
		
		try {
			List<Goods> list = this.goodsService.selectGroup();
			if(list!=null && list.size()>0) {
				rv.setCode(0);
				//�����������ϣ����ڱ�����״ͼx����y�������
				List<String> x = new ArrayList<>();
				List<Integer> y = new ArrayList<>();
				//����ѯ�������Ʒ���ƴ���x���ϣ���������y����
				for(Goods goods : list) {
					x.add(goods.getGoodsName());
					y.add(goods.getGoodsSum());
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
		rv.setCode(1);
		return rv;
	}
	

	

}
