package com.entity.view;

import com.entity.DangyuanzhuanruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党员转入
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@TableName("dangyuanzhuanru")
public class DangyuanzhuanruView  extends DangyuanzhuanruEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangyuanzhuanruView(){
	}
 
 	public DangyuanzhuanruView(DangyuanzhuanruEntity dangyuanzhuanruEntity){
 	try {
			BeanUtils.copyProperties(this, dangyuanzhuanruEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
