package com.springcloud.common;

import java.util.Date;

/**
 * �ļ��ϴ��Ĺ�����
 * @author Administrator
 *
 */

public class UploadUtils {
	/**
	 * ����µ��ļ����ƣ�������+4λ�������
	 * @return �����µ��ļ�����
	 */
	public static String getFileName() {
		String fileName = null;
		
		//���1��1000֮��������
		int num =(int)( Math.random()*1000+1);
		
		//�����������Ϊ��λ
		String tempNum = "000" + num;
		tempNum = tempNum.substring(tempNum.length() - 4);
		
		Date date = new Date();
		fileName = date.getTime() + tempNum;
		
		return fileName;
	}
	
	/**
	 * �����ļ�����չ��
	 * @param fileName �ļ���
	 * @return �ɹ������ļ���չ�������򷵻�null
	 */
	
	public static String getExtendedName(String fileName) {
		if(fileName==null || fileName.length()==0) {
			return null;
		}
		//����ļ�����.���һ�γ��ֵ�λ��
		int index = fileName.lastIndexOf(".");
		if(index==-1) {
			return null;
		}
		return fileName.substring(index);
	}
	
	//���������в���
//	public static void main(String[] args) {
//		System.out.println(getExtendedName("abcdsde.jpg"));
//	}

}
