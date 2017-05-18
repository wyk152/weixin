package com.sz.utils;

import java.security.MessageDigest;

/**
 * 字符串操作工具包
 * 项目名称：  
 * 类名称：StringUtils   
 * 类描述：   
 * 创建人：王延凯   
 * 创建时间：2017年5月17日20:48:39  
 * 修改备注：   
 * @version
 */
public class MD5Util {
	public static final String getMD5Info(String s){
		char hexDigits[] ={ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		
		try{
			byte[] btInput = s.getBytes("UTF-8");
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++){
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
