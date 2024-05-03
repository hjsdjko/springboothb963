package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangtuanhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangtuanhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangtuanhuodongView;


/**
 * 党团活动
 *
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangtuanhuodongService extends IService<DangtuanhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangtuanhuodongVO> selectListVO(Wrapper<DangtuanhuodongEntity> wrapper);
   	
   	DangtuanhuodongVO selectVO(@Param("ew") Wrapper<DangtuanhuodongEntity> wrapper);
   	
   	List<DangtuanhuodongView> selectListView(Wrapper<DangtuanhuodongEntity> wrapper);
   	
   	DangtuanhuodongView selectView(@Param("ew") Wrapper<DangtuanhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangtuanhuodongEntity> wrapper);
   	

}

