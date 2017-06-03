package com.jbit.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.jbit.base.impl.BaseDaoImpl;
import com.jbit.dao.GoodsDao;
import com.jbit.entity.Goods;

public class GoodsDaoImpl extends BaseDaoImpl<Goods> implements GoodsDao {

	@Override
	public List<Goods> getAll(int id) {
		List<Goods> list=new ArrayList<Goods>();
		String hql="";
		try {
			
			if(id==0){
				hql="from Goods";
			}else{
				hql="from Goods where billstatus="+id;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list=this.findByHql(hql, null);
		return list;
	}

}
