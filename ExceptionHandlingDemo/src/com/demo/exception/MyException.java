package com.demo.exception;

public class MyException extends Exception{

	String fileName;
	String url;
	String msg;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public MyException(String fileName,String url, String msg) {
		super("Invalid fileName: "+fileName+" "+url+" msg"+msg);
		// TODO Auto-generated constructor stub
	}

}
