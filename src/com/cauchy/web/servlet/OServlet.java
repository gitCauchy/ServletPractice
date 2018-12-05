package com.cauchy.web.servlet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class OServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		// 发送图片
		String path = "C:\\Users\\mailc\\Pictures\\timg.jpg";
		FileInputStream in = new FileInputStream(path);
		// 读取输入流中的数据到数组中
		byte[] bytes = IOUtils.toByteArray(in);
		response.getOutputStream().write(bytes);
	}
}
