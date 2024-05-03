package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 党员转出
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@TableName("dangyuanzhuanchu")
public class DangyuanzhuanchuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangyuanzhuanchuEntity() {
		
	}
	
	public DangyuanzhuanchuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 党员账号
	 */
					
	private String dangyuanzhanghao;
	
	/**
	 * 党员姓名
	 */
					
	private String dangyuanxingming;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 转出申请
	 */
					
	private String zhuanchushenqing;
	
	/**
	 * 申请时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shenqingshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：党员账号
	 */
	public void setDangyuanzhanghao(String dangyuanzhanghao) {
		this.dangyuanzhanghao = dangyuanzhanghao;
	}
	/**
	 * 获取：党员账号
	 */
	public String getDangyuanzhanghao() {
		return dangyuanzhanghao;
	}
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
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：转出申请
	 */
	public void setZhuanchushenqing(String zhuanchushenqing) {
		this.zhuanchushenqing = zhuanchushenqing;
	}
	/**
	 * 获取：转出申请
	 */
	public String getZhuanchushenqing() {
		return zhuanchushenqing;
	}
	/**
	 * 设置：申请时间
	 */
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
