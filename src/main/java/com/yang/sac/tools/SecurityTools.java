package com.yang.sac.tools;

import org.apache.commons.codec.digest.DigestUtils;

public class SecurityTools
{
	public static String digestSHA256(String password)
	{
		return DigestUtils.sha256Hex(password).toUpperCase();
	}
	
	public static String digestMD5(String password)
	{
		return DigestUtils.md5Hex(password).toUpperCase();
	}
}
