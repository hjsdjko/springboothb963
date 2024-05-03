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
 * 党建组织
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@TableName("dangjianzuzhi")
public class DangjianzuzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DangjianzuzhiEntity() {
		
	}
	
	public DangjianzuzhiEntity(T t) {
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
	 * 组织账号
	 */
					
	private String zuzhizhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：组织账号
	 */
	public void setZuzhizhanghao(String zuzhizhanghao) {
		this.zuzhizhanghao = zuzhizhanghao;
	}
	/**
	 * 获取：组织账号
	 */
	public String getZuzhizhanghao() {
		return zuzhizhanghao;
	}
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
