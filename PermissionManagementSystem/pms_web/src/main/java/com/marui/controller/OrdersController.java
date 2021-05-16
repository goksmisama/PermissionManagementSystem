package com.marui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.marui.domain.Orders;
import com.marui.service.IOrdersService;

/**
 * 订单控制器类
 * @author MaRui
 *
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private IOrdersService ordersService;

	@RequestMapping("/findAll.do")
	public ModelAndView findAll() throws Exception {
		List<Orders> list = ordersService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("ordersList",list);
		mav.setViewName("orders-list");
		return mav;
	}

	@RequestMapping("/findAllByPage.do")
	public ModelAndView findAllByPage(@RequestParam(name="pageNum",required=true,defaultValue="1")int pageNum,@RequestParam(name="pageSize",required=true,defaultValue="4")int pageSize ) throws Exception {
		List<Orders> list = ordersService.findAllByPage(pageNum,pageSize);
		PageInfo pageInfo = new PageInfo(list);
		ModelAndView mav = new ModelAndView();
		mav.addObject("pageInfo",pageInfo);
		mav.setViewName("orders-page-list");
		return mav;
	}

	@RequestMapping("/save.do")
	public String saveOrders(Orders oders) {
		ordersService.saveOrders(oders);
		System.out.println(oders);
		return "redirect:/orders/findAll.do";
	}

}
