package com.bw.service;

import java.util.List;

import com.bw.bean.Brand;
import com.bw.bean.Goods;
import com.bw.bean.Type;
import com.github.pagehelper.PageInfo;

public interface GoodsService {
	public  PageInfo<Goods> sel(Goods g,Integer pageNum);

	public String addBrand(Brand b);

	public String kind(Type t);

	public void addAll(Goods g);
}
