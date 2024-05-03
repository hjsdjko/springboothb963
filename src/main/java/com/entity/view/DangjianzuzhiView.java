package com.entity.view;

import com.entity.DangjianzuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党建组织
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@TableName("dangjianzuzhi")
public class DangjianzuzhiView  extends DangjianzuzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangjianzuzhiView(){
	}
 
 	public DangjianzuzhiView(DangjianzuzhiEntity dangjianzuzhiEntity){
 	try {
			BeanUtils.copyProperties(this, dangjianzuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
