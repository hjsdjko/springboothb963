package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangjianzuzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangjianzuzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangjianzuzhiView;


/**
 * 党建组织
 *
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangjianzuzhiService extends IService<DangjianzuzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangjianzuzhiVO> selectListVO(Wrapper<DangjianzuzhiEntity> wrapper);
   	
   	DangjianzuzhiVO selectVO(@Param("ew") Wrapper<DangjianzuzhiEntity> wrapper);
   	
   	List<DangjianzuzhiView> selectListView(Wrapper<DangjianzuzhiEntity> wrapper);
   	
   	DangjianzuzhiView selectView(@Param("ew") Wrapper<DangjianzuzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangjianzuzhiEntity> wrapper);
   	

}

