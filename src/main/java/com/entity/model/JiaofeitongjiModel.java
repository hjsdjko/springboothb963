package com.entity.model;

import com.entity.JiaofeitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缴费统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public class JiaofeitongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
