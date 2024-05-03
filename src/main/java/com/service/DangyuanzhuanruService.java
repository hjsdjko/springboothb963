package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangyuanzhuanruEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangyuanzhuanruVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanzhuanruView;


/**
 * 党员转入
 *
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangyuanzhuanruService extends IService<DangyuanzhuanruEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangyuanzhuanruVO> selectListVO(Wrapper<DangyuanzhuanruEntity> wrapper);
   	
   	DangyuanzhuanruVO selectVO(@Param("ew") Wrapper<DangyuanzhuanruEntity> wrapper);
   	
   	List<DangyuanzhuanruView> selectListView(Wrapper<DangyuanzhuanruEntity> wrapper);
   	
   	DangyuanzhuanruView selectView(@Param("ew") Wrapper<DangyuanzhuanruEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangyuanzhuanruEntity> wrapper);
   	

}

