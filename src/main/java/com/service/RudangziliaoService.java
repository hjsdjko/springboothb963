package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RudangziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RudangziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RudangziliaoView;


/**
 * 入党资料
 *
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface RudangziliaoService extends IService<RudangziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RudangziliaoVO> selectListVO(Wrapper<RudangziliaoEntity> wrapper);
   	
   	RudangziliaoVO selectVO(@Param("ew") Wrapper<RudangziliaoEntity> wrapper);
   	
   	List<RudangziliaoView> selectListView(Wrapper<RudangziliaoEntity> wrapper);
   	
   	RudangziliaoView selectView(@Param("ew") Wrapper<RudangziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RudangziliaoEntity> wrapper);
   	

}

