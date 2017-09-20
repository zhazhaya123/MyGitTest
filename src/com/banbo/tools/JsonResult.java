package com.banbo.tools;

import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 用于JSON格式化
 * @author 陈余豪
 * 
 * @param <T>
 */
public class JsonResult<T> {
	
	public static final int SUCCESS = 1; // 成功
	public static final int ERROR = -1; // 失败，出现错误
	
	private int code;
	private T data;
	private String message;
	
	public JsonResult() {
	}
	
	public JsonResult(int state) {
		this.code = state;
	}
	
	public JsonResult(T data) {
		super();
		this.data = data;
	}

	public JsonResult(String message) {
		super();
		this.message = message;
	}

	public JsonResult(int state, T data) {
		super();
		this.code = state;
		this.data = data;
	}

	public JsonResult(int state, String message) {
		super();
		this.code = state;
		this.message = message;
	}

	public JsonResult(T data, String message) {
		super();
		this.data = data;
		this.message = message;
	}

	public JsonResult(int state, T data, String message) {
		super();
		this.code = state;
		this.data = data;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
