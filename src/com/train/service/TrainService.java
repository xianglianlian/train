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
	
	//��ѯȫ������
	public List<TrainInfo> findAllTrain(){
		return trainDao.findAllTrain() ;
	}
	//��ӳ���
	public boolean addTrain(TrainInfo train){
		return trainDao.addTrain(train) ;
	}
	
	public void setTrainDao(TrainDao trainDao) {
		this.trainDao = trainDao;
	}
}
