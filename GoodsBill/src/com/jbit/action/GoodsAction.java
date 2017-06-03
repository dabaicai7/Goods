package com.jbit.action;

import java.util.List;

import com.jbit.base.BaseAction;
import com.jbit.entity.Goods;
import com.jbit.service.GoodService;

public class GoodsAction extends BaseAction {
	
	private GoodService service;
	private List<Goods> list;
	private int id;
	
	//ͨ根据id获取区域订单信息
	public String show(){
		list=service.getAll(id);
		return "success";
		
	}
	
	public GoodService getSevice() {
		return service;
	}
	public void setSevice(GoodService service) {
		this.service = service;
	}
	public List<Goods> getList() {
		return list;
	}
	public void setList(List<Goods> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
