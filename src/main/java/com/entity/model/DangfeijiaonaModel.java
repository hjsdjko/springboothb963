package com.entity.model;

import com.entity.DangfeijiaonaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 党费缴纳
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public class DangfeijiaonaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 党员姓名
	 */
	
	private String dangyuanxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 党支部
	 */
	
	private String dangzhibu;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 党费
	 */
	
	private Integer dangfei;
		
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 提交日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：党员姓名
	 */
	 
	public void setDangyuanxingming(String dangyuanxingming) {
		this.dangyuanxingming = dangyuanxingming;
	}
	
	/**
	 * 获取：党员姓名
	 */
	public String getDangyuanxingming() {
		return dangyuanxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：党支部
	 */
	 
	public void setDangzhibu(String dangzhibu) {
		this.dangzhibu = dangzhibu;
	}
	
	/**
	 * 获取：党支部
	 */
	public String getDangzhibu() {
		return dangzhibu;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：党费
	 */
	 
	public void setDangfei(Integer dangfei) {
		this.dangfei = dangfei;
	}
	
	/**
	 * 获取：党费
	 */
	public Integer getDangfei() {
		return dangfei;
	}
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
	/**
	 * 设置：提交日期
	 */
	 
	public void setTijiaoriqi(Date tijiaoriqi) {
		this.tijiaoriqi = tijiaoriqi;
	}
	
	/**
	 * 获取：提交日期
	 */
	public Date getTijiaoriqi() {
		return tijiaoriqi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
