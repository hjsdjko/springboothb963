package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaofeitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaofeitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaofeitongjiView;


/**
 * 缴费统计
 *
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface JiaofeitongjiService extends IService<JiaofeitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaofeitongjiVO> selectListVO(Wrapper<JiaofeitongjiEntity> wrapper);
   	
   	JiaofeitongjiVO selectVO(@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);
   	
   	List<JiaofeitongjiView> selectListView(Wrapper<JiaofeitongjiEntity> wrapper);
   	
   	JiaofeitongjiView selectView(@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaofeitongjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiaofeitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiaofeitongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiaofeitongjiEntity> wrapper);
}

