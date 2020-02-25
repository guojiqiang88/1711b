package com.bw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Brand;
import com.bw.bean.Goods;
import com.bw.bean.Type;
import com.bw.mapper.GoodsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;

	public PageInfo<Goods> sel(Goods g, Integer pageNum) {
		PageHelper.startPage(pageNum, 2);
		PageInfo<Goods> page = new PageInfo<Goods>(goodsMapper.sel(g));
		
		return page;
	}

	
	public String addBrand(Brand b) {
		// TODO Auto-generated method stub
		return goodsMapper.addBrand(b);
	}


	public String kind(Type t) {
		// TODO Auto-generated method stub
		return goodsMapper.kind(t);
	}


	public void addAll(Goods g) {
		goodsMapper.addAll(g);
		
	}
}
