package com.train.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.train.entity.TrainInfo;

@Repository("trainDao")
public class TrainDao extends BaseDao{
	
	//查询全部车次
	public List findAllTrain() {
		return getSession().createQuery("from TrainInfo").list();
	}
	//添加车次
	public boolean addTrain(TrainInfo t) {
		try {
			getSession().save(t) ;
			return true ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
