package com.demo.VO;

//返回给前端的视图对象
//最终的json对象--形式由最终的api文档决定
public class ResultVO<T> {
	//错误码
	private Integer code;
	//提示信息
	private String msg;
	//具体内容
	private T data;
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ResultVO() {
	}
	public ResultVO(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultVO [code=" + code + ", msg=" + msg + ", data=" + data + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
