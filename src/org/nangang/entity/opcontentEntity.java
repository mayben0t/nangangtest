package org.nangang.entity;

import java.io.Serializable;
import java.util.Date;

public class opcontentEntity implements Serializable{

	/**
	 * 数据库中opcontent表对应的实体类
	 */
	private static final long serialVersionUID = -980796798123778089L;

	private Integer		glId;						//高炉号
	private	String		guanId;						//罐号
	private	Integer		tieCi;						//铁次
	private	Date		arriveTime;					//到达时间
	private	Integer		tlId;						//脱硫号（主键）
	private	Float		arriveHeight;				//到达重量
	private	Float		leaveHeight;				//离开重量
	private	Float		preliu;						//脱硫前含量
	private	Float		afterliu;					//脱硫后含量
	private	Integer		isHit;						//是否命中
	private	Integer		preTem;						//脱前温度
	private	Integer		afterTem;					//脱后温度
	private	String		modifier;					//修改人
//	private java.sql.Date
	
	
	
	
	
	
	
	
	
	public Integer getGlId() {
		return glId;
	}
	public void setGlId(Integer glId) {
		this.glId = glId;
	}
	public String getGuanId() {
		return guanId;
	}
	public void setGuanId(String guanId) {
		this.guanId = guanId;
	}
	public Integer getTieCi() {
		return tieCi;
	}
	public void setTieCi(Integer tieCi) {
		this.tieCi = tieCi;
	}
	public Date getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	public Integer getTlId() {
		return tlId;
	}
	public void setTlId(Integer tlId) {
		this.tlId = tlId;
	}
	public Float getArriveHeight() {
		return arriveHeight;
	}
	public void setArriveHeight(Float arriveHeight) {
		this.arriveHeight = arriveHeight;
	}
	public Float getLeaveHeight() {
		return leaveHeight;
	}
	public void setLeaveHeight(Float leaveHeight) {
		this.leaveHeight = leaveHeight;
	}
	public Float getPreliu() {
		return preliu;
	}
	public void setPreliu(Float preliu) {
		this.preliu = preliu;
	}
	public Float getAfterliu() {
		return afterliu;
	}
	public void setAfterliu(Float afterliu) {
		this.afterliu = afterliu;
	}
	public Integer getIsHit() {
		return isHit;
	}
	public void setIsHit(Integer isHit) {
		this.isHit = isHit;
	}
	public Integer getPreTem() {
		return preTem;
	}
	public void setPreTem(Integer preTem) {
		this.preTem = preTem;
	}
	public Integer getAfterTem() {
		return afterTem;
	}
	public void setAfterTem(Integer afterTem) {
		this.afterTem = afterTem;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		String total="高炉号："+getGlId()+" 罐号："+getGuanId()+" 铁次："+getTieCi()
		+" 到达时间:"+getArriveTime()+" 脱硫号:"+getTlId()+" 到达重量："+getArriveHeight()
		+" 离开重量："+getLeaveHeight()+" 脱硫前含量:"+getPreliu()+" 脱后硫含量："+getAfterliu()
		+" 是否命中:"+getIsHit()+" 脱前温度:"+getPreTem()+" 脱后温度:"+getAfterTem()+" 修改人："+getModifier();
		return total;
	}
}
