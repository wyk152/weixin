package com.sz.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
public class MD5Tool {
	/**
	 * 生成MD5密文
	 * 
	 * @param str
	 *            生进行摘要的内容
	 * @return 返回摘要16进制串
	 */
	public static String ToMD5(final String str) {
		if (str == null) {
			return null;
		}
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] buf = messageDigest.digest(str.getBytes());
			String tt = byte2HexString(buf);
			String md5Str1 = tt;
			System.out.println(md5Str1);
			String md5Str2 = tt.substring(8, 24);
			System.out.println(md5Str2);
			return tt;

		} catch (NoSuchAlgorithmException e) {
			throw new SecurityException(e.getMessage());
		}
	}

	/**
	 * 将字节数组转换为16进制字符串
	 * 
	 * @param data
	 *            进行转换的字节数组
	 * @return 16进制的字符串
	 */
	public static String byte2HexString(byte[] data) {
		StringBuffer checksumSb = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			String hexStr = Integer.toHexString(0x00ff & data[i]);
			if (hexStr.length() < 2) {
				checksumSb.append("0");
			}
			checksumSb.append(hexStr);
		}
		return checksumSb.toString();
	}

	public static void main(String[] args) throws Exception {
		System.out.println(ToMD5("哈哈"));
	}
}
