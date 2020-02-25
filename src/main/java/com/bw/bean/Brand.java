package com.bw.bean;

public class Brand {
	private Integer bid;
	private String brand;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", brand=" + brand + "]";
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Brand(Integer bid, String brand) {
		super();
		this.bid = bid;
		this.brand = brand;
	}
}
