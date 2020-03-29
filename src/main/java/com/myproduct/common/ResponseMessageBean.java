package com.myproduct.common;

import org.springframework.stereotype.Component;


public class ResponseMessageBean {

	private Integer code;
	private Object message;
	
	public ResponseMessageBean(Integer code, Object message) {
		this.code=code;
		this.message = message;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}
	
}
