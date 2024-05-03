package com.entity.view;

import com.entity.JiaofeitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 缴费统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@TableName("jiaofeitongji")
public class JiaofeitongjiView  extends JiaofeitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaofeitongjiView(){
	}
 
 	public JiaofeitongjiView(JiaofeitongjiEntity jiaofeitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaofeitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
