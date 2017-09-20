package com.banbo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class fkwebserverController {
	

	@RequestMapping(value = "/fkwebserver")
	@ResponseBody
	public String cdata(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("1111111111111111111111111");
		
//		String request_code = request.getParameter("request_code");//需求代码
//		String dev_id = request.getParameter("dev_id");//机器识别号
//		String Content_type = request.getParameter("Content-type");//MIME类型
//		String Content_Length = request.getParameter("Content-Length");//消息的传输长度
//		String trans_id = request.getParameter("trans_id");//任务识别码
//		String cmd_return_code = request.getParameter("cmd_return_code");//指令结果代码
//		String blk_no = request.getParameter("blk_no");//块序号
//		String response_code = request.getParameter("response_code");//应答代码
//		
//		String string = request.getQueryString();
//		System.out.println("请求参数：" + string);
//		System.out.println(request_code);
//		
//		String http = null;
//		String body = null;
//		String date = null;
//		
//		PrintWriter printWriter = null;
//		
//		if(request_code.equals("receive_cmd")){//机器接收操作者指令的请求
//			if(dev_id == null || Content_type != "application/octet-stream" || Content_Length == null) {
//				http ="HTTP/1.1 200 OK\nCache-Control: private\nServer: Microsoft-IIS/7.5\n"
//					+ "Set-Cookie: ASP.NET_SessionId=453lmc45jaelft45glb2mdre; path=/; HttpOnly\n"
//					+ "X-AspNet-Version: 2.0.50727\nX-Powered-By: ASP.NET\nDate: Wed, 10 Dec 2014 04:47:42 GMT\n"
//					+ "Connection: close\n";
//				body ="Content-Length:"  + Content_Length + "\nContent-Type: " + Content_type + "\n" 
//					+ "response_code: ERROR\ntrans_id:" + Content_Length 
//					+ "\ncmd_code: GET_ENROLL_DATA";
//				
//				date = http + body;
//				
//				try {
//				     printWriter = response.getWriter();
//				     printWriter.print(date);
//				   } catch (IOException ex) {
//				      ex.printStackTrace();
//				   } finally {
//				      if (null != printWriter) {
//				         printWriter.flush();
//				         printWriter.close();
//				       }
//				   }
//			} else {
//				http ="HTTP/1.1 200 OK\nCache-Control: private\nServer: Microsoft-IIS/7.5\n"
//						+ "Set-Cookie: ASP.NET_SessionId=453lmc45jaelft45glb2mdre; path=/; HttpOnly\n"
//						+ "X-AspNet-Version: 2.0.50727\nX-Powered-By: ASP.NET\nDate: Wed, 10 Dec 2014 04:47:42 GMT\n"
//						+ "Connection: close\n";
//					body ="Content-Length:"  + Content_Length + "\nContent-Type: " + Content_type + "\n" 
//						+ "response_code: OK\ntrans_id:" + Content_Length 
//						+ "\ncmd_code: GET_ENROLL_DATA";
//					
//					date = http + body;
//
//					try {
//					     printWriter = response.getWriter();
//					     printWriter.print(date);
//					   } catch (IOException ex) {
//					      ex.printStackTrace();
//					   } finally {
//					      if (null != printWriter) {
//					         printWriter.flush();
//					         printWriter.close();
//					       }
//					   }
//			}
//		} else if (request_code.equals("send_cmd_result")){
//			if (dev_id == null || trans_id == null || cmd_return_code == null || Content_type != "application/octet-stream") {
//				http ="HTTP/1.1 200 OK\nCache-Control: private\nServer: Microsoft-IIS/7.5\n"
//					+ "Set-Cookie: ASP.NET_SessionId=453lmc45jaelft45glb2mdre; path=/; HttpOnly\n"
//					+ "X-AspNet-Version: 2.0.50727\nX-Powered-By: ASP.NET\nDate: Wed, 10 Dec 2014 04:47:42 GMT\n"
//					+ "Connection: close\n";
//				body = "response_code: REEOR \n"
//					+ "trans_id" + Content_Length;
//				
//				date = http + body;
//				
//				try {
//					 response.reset();
//				     printWriter = response.getWriter();
//				     printWriter.print(date);
//				   } catch (IOException ex) {
//				      ex.printStackTrace();
//				   } finally {
//				      if (null != printWriter) {
//				         printWriter.flush();
//				         printWriter.close();
//				       }
//				   }
//			} else {
//				http ="HTTP/1.1 200 OK\nCache-Control: private\nServer: Microsoft-IIS/7.5\n"
//						+ "Set-Cookie: ASP.NET_SessionId=453lmc45jaelft45glb2mdre; path=/; HttpOnly\n"
//						+ "X-AspNet-Version: 2.0.50727\nX-Powered-By: ASP.NET\nDate: Wed, 10 Dec 2014 04:47:42 GMT\n"
//						+ "Connection: close\n";
//					body = "response_code: OK \n"
//						+ "trans_id" + Content_Length;
//					
//					date = http + body;
//					
//					try {
//					     printWriter = response.getWriter();
//					     printWriter.print(date);
//					   } catch (IOException ex) {
//					      ex.printStackTrace();
//					   } finally {
//					      if (null != printWriter) {
//					         printWriter.flush();
//					         printWriter.close();
//					       }
//					   }
//			}
//			
//		}		
		
		return "未知请求";
	}

	
/*	
    POST / HTTP/1.0
	Accept: image/gif, image/x-xbitmap, image/jpeg, image/pjpeg, application/vnd.ms-excel, application/msword, application/vnd.ms-powerpoint,
	Accept-Language: en-us
	Accept-Encoding: gzip, deflate
	User-Agent: Mozilla/4.0
	Connection: close
	Content-Type: application/octet-stream
	request_code: receive_cmd
	dev_id: 001
	Content-Length: 201
*/
	
}
