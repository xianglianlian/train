package com.train.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.train.dao.TrainDao;
import com.train.entity.TrainInfo;

@Service("trainService")
public class TrainService {
	@Resource
	private TrainDao trainDao ;
	
	//查询全部车次
	public List<TrainInfo> findAllTrain(){
		return trainDao.findAllTrain() ;
	}
	//添加车次
	public boolean addTrain(TrainInfo train){
		return trainDao.addTrain(train) ;
	}
	
	public void setTrainDao(TrainDao trainDao) {
		this.trainDao = trainDao;
	}
}
