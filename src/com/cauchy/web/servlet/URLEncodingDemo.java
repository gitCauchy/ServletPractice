package com.cauchy.web.servlet;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

import org.junit.Test;

public class URLEncodingDemo {
	@Test
	public void fun1() throws Exception{
		String name = "测试";
		String url = URLEncoder.encode(name, "UTF-8");
		System.out.println(url);
		String s = URLDecoder.decode(url, "UTF-8");
		System.out.println(s);
	}
}
