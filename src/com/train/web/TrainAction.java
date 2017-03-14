package com.train.web;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.train.entity.TrainInfo;
import com.train.service.TrainService;

@Controller("trainAction")
@Scope("prototype")
public class TrainAction extends ActionSupport {
	
	private TrainInfo trainInfo ;
	@Resource
	private TrainService trainService ;
	
	private List trainList ;
	
	//查询全部车次
	public String findAllTrain(){
		trainList = trainService.findAllTrain() ;
		return "trainlist";
	}
	
	//添加车次
	public String addTrain() throws Exception{
		if(trainService.addTrain(trainInfo)){
			return "index" ;
		}else{
			return "error";
		}
	}

	public TrainInfo getTrainInfo() {
		return trainInfo;
	}

	public void setTrainInfo(TrainInfo trainInfo) {
		this.trainInfo = trainInfo;
	}
	public void setTrainService(TrainService trainService) {
		this.trainService = trainService;
	}
	public void setTrainList(List trainList) {
		this.trainList = trainList;
	}
	public List getTrainList() {
		return trainList;
	}
}
