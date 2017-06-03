package com.jbit.service.impl;

import java.util.List;

import com.jbit.dao.GoodsDao;
import com.jbit.entity.Goods;
import com.jbit.service.GoodService;

public class GoodsServiceImpl implements GoodService {
	private GoodsDao dao;
	
	@Override
	public List<Goods> getAll(int id) {
		
		return dao.getAll(id);
	}

	public GoodsDao getDao() {
		return dao;
	}

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	
	

}
