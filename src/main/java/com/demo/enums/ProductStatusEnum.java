package com.demo.enums;

//枚举类型
//定义上下架状态
public enum ProductStatusEnum {
	UP(0,"在架"),
	DOWN(1,"下架")
	;
	private Integer code;
	private String message;
	private ProductStatusEnum(Integer code,String message) {
		this.code=code;
		this.message=message;
	}
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
