package com.bw.mapper;

import java.util.List;

import com.bw.bean.Brand;
import com.bw.bean.Goods;
import com.bw.bean.Type;

public interface GoodsMapper {
 public  List<Goods> sel(Goods g);

public String addBrand(Brand b);

public String kind(Type t);

public void addAll(Goods g);
}
