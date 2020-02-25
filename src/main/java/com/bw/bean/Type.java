package com.bw.bean;

public class Type {
	private Integer tid;
	private String type;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "type [tid=" + tid + ", type=" + type + "]";
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Type(Integer tid, String type) {
		super();
		this.tid = tid;
		this.type = type;
	}
}
