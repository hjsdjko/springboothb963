package com.entity.view;

import com.entity.DangyuanzhuanchuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党员转出
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@TableName("dangyuanzhuanchu")
public class DangyuanzhuanchuView  extends DangyuanzhuanchuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangyuanzhuanchuView(){
	}
 
 	public DangyuanzhuanchuView(DangyuanzhuanchuEntity dangyuanzhuanchuEntity){
 	try {
			BeanUtils.copyProperties(this, dangyuanzhuanchuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
