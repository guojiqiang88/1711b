package com.bw.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.bean.Brand;
import com.bw.bean.Goods;
import com.bw.bean.Type;
import com.bw.service.GoodsService;
import com.bw.utils.FileUtils;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("list")
	public String sel(Model model,Goods g,@RequestParam(defaultValue="1") Integer pageNum){
		model.addAttribute("g", g);
		model.addAttribute("page", goodsService.sel(g, pageNum));
		return "list";
		
	}
	
	@RequestMapping("loojimg")
	public void loojimg(String path,HttpServletRequest request,HttpServletResponse response){
		 FileUtils.lookImg(path, request, response);
	}
	@RequestMapping("add")
	@ResponseBody
	public String add(Goods g,MultipartFile file){
		try {
			String upload = FileUtils.upload(file);
			g.setImgurl(upload);
			goodsService.addAll(g);
			return "redirect:list";
		} catch (Exception e) {
			return "add";
		}
		
	}
	@RequestMapping("brandAndKind")
	@ResponseBody
	public Map<String, Object> brandAndKind(Brand b,Type t ){
		String brand = goodsService.addBrand(b);
		String kind = goodsService.kind(t);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("brand", brand);
		map.put("kind", kind);
		
		
		return map;
		
	}
}
