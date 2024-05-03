package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanzhuanchuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanzhuanchuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanzhuanchuView;


/**
 * 党员转出
 *
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangyuanzhuanchuService extends IService<DangyuanzhuanchuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanzhuanchuVO> selectListVO(Wrapper<DangyuanzhuanchuEntity> wrapper);
   	
   	DangyuanzhuanchuVO selectVO(@Param("ew") Wrapper<DangyuanzhuanchuEntity> wrapper);
   	
   	List<DangyuanzhuanchuView> selectListView(Wrapper<DangyuanzhuanchuEntity> wrapper);
   	
   	DangyuanzhuanchuView selectView(@Param("ew") Wrapper<DangyuanzhuanchuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanzhuanchuEntity> wrapper);
   	

}

