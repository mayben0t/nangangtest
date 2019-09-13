package org.nangang.entity;

import java.io.Serializable;
import java.util.Date;

public class opcontentEntity implements Serializable{

	/**
	 * ���ݿ
	 */
	private static final long serialVersionUID = -980796798123778089L;

	private Integer		glId;
	private	String		guanId;
	private	Integer		tieCi;
	private	Date		arriveTime;
	private	Integer		tlId;
	private	Float		arriveHeight;
	private	Float		leaveHeight;
	private	Float		preliu;
	private	Float		afterliu;
	private	Integer		isHit;
	private	Integer		preTem;
	private	Integer		afterTem;
	private	String		modifier;
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
		String total="��¯�ţ�"+getGlId()+" �޺ţ�"+getGuanId()+" ���Σ�"+getTieCi()
		+" ����ʱ��:"+getArriveTime()+" �����:"+getTlId()+" ����������"+getArriveHeight()
		+" �뿪������"+getLeaveHeight()+" ����ǰ����:"+getPreliu()+" �Ѻ�������"+getAfterliu()
		+" �Ƿ�����:"+getIsHit()+" ��ǰ�¶�:"+getPreTem()+" �Ѻ��¶�:"+getAfterTem()+" �޸��ˣ�"+getModifier();
		return total;
	}
}
