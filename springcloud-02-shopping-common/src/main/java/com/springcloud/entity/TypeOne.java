package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  TYPE_ONE���Ӧ��ʵ���࣬���ڱ������һ��һ�������Ϣ
 * @author ZHANGLI
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOne implements java.io.Serializable{
	
	private static final long serialVersionUID = -2690542590151848525L;
	/**
	 * ����һ���
	 */
	private Integer typeOneId;
	/**
	 * ����һ����
	 */
	private String typeOneName;
	/**
	 * ���
	 */
	private Integer typeOneNum;
	/**
	 * ��ע
	 */
	private String typeOneRemark;

}