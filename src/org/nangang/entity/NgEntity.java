package org.nangang.entity;


import java.io.Serializable;
import java.sql.Date;

public class NgEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7742060698132408894L;
	
	
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
	private Date		date;						//日期
	private String		banCi;						//班次
	private String		zhanBie;					//站别
	private String		tieBaoBaoId;				//铁包包号
	private Integer		baoAge;						//包龄
	private String		luId;						//炉号
	private String		gangZhong;					//钢种
	private String		tieShuiQuXiang;				//铁水去向
	private Date		tieBaoLeaveTime;			//铁包离开时间
	private Date		KRStartTime;				//KR开始时间
	private Date		KROverTime;					//KR结束时间
	private Integer		GoalLiu;					//目标硫含量
	private Integer		LiuDown;					//含硫下降量
	private	Date		preBaBegin;					//处理前扒渣开始时间
	private	Date		preBaOver;					//处理前扒渣结束时间
	private Date		afterBaBegin;				//处理后扒渣开始时间
	private Date		afterBaOver;				//处理后扒渣结束时间
	private	Integer		danCon;						//氮气用量
	private	Integer		tuoCycle;					//脱硫周期
	public NgEntity() {
		super();
	}
	public NgEntity(Integer glId, String guanId, Integer tieCi, Date arriveTime, Integer tlId, Float arriveHeight,
			Float leaveHeight, Float preliu, Float afterliu, Integer isHit, Integer preTem, Integer afterTem,
			String modifier, Date date, String banCi, String zhanBie, String tieBaoBaoId, Integer baoAge, String luId,
			String gangZhong, String tieShuiQuXiang, Date tieBaoLeaveTime, Date kRStartTime, Date kROverTime,
			Integer goalLiu, Integer liuDown, Date preBaBegin, Date preBaOver, Date afterBaBegin, Date afterBaOver,
			Integer danCon, Integer tuoCycle) {
		super();
		this.glId = glId;
		this.guanId = guanId;
		this.tieCi = tieCi;
		this.arriveTime = arriveTime;
		this.tlId = tlId;
		this.arriveHeight = arriveHeight;
		this.leaveHeight = leaveHeight;
		this.preliu = preliu;
		this.afterliu = afterliu;
		this.isHit = isHit;
		this.preTem = preTem;
		this.afterTem = afterTem;
		this.modifier = modifier;
		this.date = date;
		this.banCi = banCi;
		this.zhanBie = zhanBie;
		this.tieBaoBaoId = tieBaoBaoId;
		this.baoAge = baoAge;
		this.luId = luId;
		this.gangZhong = gangZhong;
		this.tieShuiQuXiang = tieShuiQuXiang;
		this.tieBaoLeaveTime = tieBaoLeaveTime;
		KRStartTime = kRStartTime;
		KROverTime = kROverTime;
		GoalLiu = goalLiu;
		LiuDown = liuDown;
		this.preBaBegin = preBaBegin;
		this.preBaOver = preBaOver;
		this.afterBaBegin = afterBaBegin;
		this.afterBaOver = afterBaOver;
		this.danCon = danCon;
		this.tuoCycle = tuoCycle;
	}
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBanCi() {
		return banCi;
	}
	public void setBanCi(String banCi) {
		this.banCi = banCi;
	}
	public String getZhanBie() {
		return zhanBie;
	}
	public void setZhanBie(String zhanBie) {
		this.zhanBie = zhanBie;
	}
	public String getTieBaoBaoId() {
		return tieBaoBaoId;
	}
	public void setTieBaoBaoId(String tieBaoBaoId) {
		this.tieBaoBaoId = tieBaoBaoId;
	}
	public Integer getBaoAge() {
		return baoAge;
	}
	public void setBaoAge(Integer baoAge) {
		this.baoAge = baoAge;
	}
	public String getLuId() {
		return luId;
	}
	public void setLuId(String luId) {
		this.luId = luId;
	}
	public String getGangZhong() {
		return gangZhong;
	}
	public void setGangZhong(String gangZhong) {
		this.gangZhong = gangZhong;
	}
	public String getTieShuiQuXiang() {
		return tieShuiQuXiang;
	}
	public void setTieShuiQuXiang(String tieShuiQuXiang) {
		this.tieShuiQuXiang = tieShuiQuXiang;
	}
	public Date getTieBaoLeaveTime() {
		return tieBaoLeaveTime;
	}
	public void setTieBaoLeaveTime(Date tieBaoLeaveTime) {
		this.tieBaoLeaveTime = tieBaoLeaveTime;
	}
	public Date getKRStartTime() {
		return KRStartTime;
	}
	public void setKRStartTime(Date kRStartTime) {
		KRStartTime = kRStartTime;
	}
	public Date getKROverTime() {
		return KROverTime;
	}
	public void setKROverTime(Date kROverTime) {
		KROverTime = kROverTime;
	}
	public Integer getGoalLiu() {
		return GoalLiu;
	}
	public void setGoalLiu(Integer goalLiu) {
		GoalLiu = goalLiu;
	}
	public Integer getLiuDown() {
		return LiuDown;
	}
	public void setLiuDown(Integer liuDown) {
		LiuDown = liuDown;
	}
	public Date getPreBaBegin() {
		return preBaBegin;
	}
	public void setPreBaBegin(Date preBaBegin) {
		this.preBaBegin = preBaBegin;
	}
	public Date getPreBaOver() {
		return preBaOver;
	}
	public void setPreBaOver(Date preBaOver) {
		this.preBaOver = preBaOver;
	}
	public Date getAfterBaBegin() {
		return afterBaBegin;
	}
	public void setAfterBaBegin(Date afterBaBegin) {
		this.afterBaBegin = afterBaBegin;
	}
	public Date getAfterBaOver() {
		return afterBaOver;
	}
	public void setAfterBaOver(Date afterBaOver) {
		this.afterBaOver = afterBaOver;
	}
	public Integer getDanCon() {
		return danCon;
	}
	public void setDanCon(Integer danCon) {
		this.danCon = danCon;
	}
	public Integer getTuoCycle() {
		return tuoCycle;
	}
	public void setTuoCycle(Integer tuoCycle) {
		this.tuoCycle = tuoCycle;
	}
	
	
}
