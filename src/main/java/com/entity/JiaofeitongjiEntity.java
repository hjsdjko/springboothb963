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
 * 缴费统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@TableName("jiaofeitongji")
public class JiaofeitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaofeitongjiEntity() {
		
	}
	
	public JiaofeitongjiEntity(T t) {
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
	 * 月份
	 */
					
	private String yuefen;
	
	/**
	 * 缴费人数
	 */
					
	private Integer jiaofeirenshu;
	
	/**
	 * 未交费人数
	 */
					
	private Integer weijiaofeirenshu;
	
	/**
	 * 统计时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tongjishijian;
	
	
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
	 * 设置：缴费人数
	 */
	public void setJiaofeirenshu(Integer jiaofeirenshu) {
		this.jiaofeirenshu = jiaofeirenshu;
	}
	/**
	 * 获取：缴费人数
	 */
	public Integer getJiaofeirenshu() {
		return jiaofeirenshu;
	}
	/**
	 * 设置：未交费人数
	 */
	public void setWeijiaofeirenshu(Integer weijiaofeirenshu) {
		this.weijiaofeirenshu = weijiaofeirenshu;
	}
	/**
	 * 获取：未交费人数
	 */
	public Integer getWeijiaofeirenshu() {
		return weijiaofeirenshu;
	}
	/**
	 * 设置：统计时间
	 */
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}

}
