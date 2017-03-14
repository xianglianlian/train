package com.train.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainInfo")
public class TrainInfo {
	private String trainNo ;		//车次编号
	private String fromStation ;	//起始站
	private String toStation ;		//终点站
	private int seatNum ;			//硬座数量
	private float seatPrice ;		//硬座单价
	private int bedNum ;			//硬卧数量
	private float bedPrice ;		//硬卧单价
	
	public TrainInfo() {
		super();
	}
	public TrainInfo(String trainNo, String fromStation, String toStation, int seatNum, float seatPrice, int bedNum,
			float bedPrice) {
		super();
		this.trainNo = trainNo;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.seatNum = seatNum;
		this.seatPrice = seatPrice;
		this.bedNum = bedNum;
		this.bedPrice = bedPrice;
	}
	@Id
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getFromStation() {
		return fromStation;
	}
	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}
	public String getToStation() {
		return toStation;
	}
	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	public float getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(float seatPrice) {
		this.seatPrice = seatPrice;
	}
	public int getBedNum() {
		return bedNum;
	}
	public void setBedNum(int bedNum) {
		this.bedNum = bedNum;
	}
	public float getBedPrice() {
		return bedPrice;
	}
	public void setBedPrice(float bedPrice) {
		this.bedPrice = bedPrice;
	}
}
