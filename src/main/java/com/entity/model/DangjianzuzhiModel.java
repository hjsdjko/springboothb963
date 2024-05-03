package com.entity.model;

import com.entity.DangjianzuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 党建组织
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public class DangjianzuzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 组织名称
	 */
	
	private String zuzhimingcheng;
		
	/**
	 * 创立者
	 */
	
	private String chuanglizhe;
		
	/**
	 * 组织人数
	 */
	
	private Integer zuzhirenshu;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 组织详情
	 */
	
	private String zuzhixiangqing;
		
	/**
	 * 创立日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangliriqi;
		
	/**
	 * 管理党支部
	 */
	
	private String guanlidangzhibu;
		
	/**
	 * 管理成员
	 */
	
	private String guanlichengyuan;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：组织名称
	 */
	 
	public void setZuzhimingcheng(String zuzhimingcheng) {
		this.zuzhimingcheng = zuzhimingcheng;
	}
	
	/**
	 * 获取：组织名称
	 */
	public String getZuzhimingcheng() {
		return zuzhimingcheng;
	}
				
	
	/**
	 * 设置：创立者
	 */
	 
	public void setChuanglizhe(String chuanglizhe) {
		this.chuanglizhe = chuanglizhe;
	}
	
	/**
	 * 获取：创立者
	 */
	public String getChuanglizhe() {
		return chuanglizhe;
	}
				
	
	/**
	 * 设置：组织人数
	 */
	 
	public void setZuzhirenshu(Integer zuzhirenshu) {
		this.zuzhirenshu = zuzhirenshu;
	}
	
	/**
	 * 获取：组织人数
	 */
	public Integer getZuzhirenshu() {
		return zuzhirenshu;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：组织详情
	 */
	 
	public void setZuzhixiangqing(String zuzhixiangqing) {
		this.zuzhixiangqing = zuzhixiangqing;
	}
	
	/**
	 * 获取：组织详情
	 */
	public String getZuzhixiangqing() {
		return zuzhixiangqing;
	}
				
	
	/**
	 * 设置：创立日期
	 */
	 
	public void setChuangliriqi(Date chuangliriqi) {
		this.chuangliriqi = chuangliriqi;
	}
	
	/**
	 * 获取：创立日期
	 */
	public Date getChuangliriqi() {
		return chuangliriqi;
	}
				
	
	/**
	 * 设置：管理党支部
	 */
	 
	public void setGuanlidangzhibu(String guanlidangzhibu) {
		this.guanlidangzhibu = guanlidangzhibu;
	}
	
	/**
	 * 获取：管理党支部
	 */
	public String getGuanlidangzhibu() {
		return guanlidangzhibu;
	}
				
	
	/**
	 * 设置：管理成员
	 */
	 
	public void setGuanlichengyuan(String guanlichengyuan) {
		this.guanlichengyuan = guanlichengyuan;
	}
	
	/**
	 * 获取：管理成员
	 */
	public String getGuanlichengyuan() {
		return guanlichengyuan;
	}
			
}
