package com.bw.bean;

public class Goods {
	private Integer gid;
	private Integer tid;
	private Integer bid;
	private Integer num;
	private String name;
	private String ename;
	private String rize;
	private String bq;
	private String imgurl;
	private String price;
	private String brand;
	private String type;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", tid=" + tid + ", pid=" + bid + ", num=" + num + ", name=" + name + ", ename="
				+ ename + ", rize=" + rize + ", bq=" + bq + ", imgurl=" + imgurl + ", price=" + price + ", brand="
				+ brand + ", type=" + type + "]";
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid( Integer bid) {
		this.bid = bid;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getRize() {
		return rize;
	}
	public void setRize(String rize) {
		this.rize = rize;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Goods(Integer gid, Integer tid, Integer bid, Integer num, String name, String ename, String rize, String bq,
			String imgurl, String price, String brand, String type) {
		super();
		this.gid = gid;
		this.tid = tid;
		this.bid = bid;
		this.num = num;
		this.name = name;
		this.ename = ename;
		this.rize = rize;
		this.bq = bq;
		this.imgurl = imgurl;
		this.price = price;
		this.brand = brand;
		this.type = type;
	}
}
