package com.marui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.marui.domain.Orders;
import com.marui.domain.Product;
import com.marui.service.IProductService;

/**
 * 产品控制器类
 * @author MaRui
 *
 */
@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/findAll.do")
	public ModelAndView findAll() throws Exception {
		List<Product> products = productService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("productList",products);
		mav.setViewName("product-page-list");
		return mav;
	}
}
