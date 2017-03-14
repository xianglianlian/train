package com.train.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.train.entity.TrainInfo;

@Repository("trainDao")
public class TrainDao extends BaseDao{
	
	//��ѯȫ������
	public List findAllTrain() {
		return getSession().createQuery("from TrainInfo").list();
	}
	//��ӳ���
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
