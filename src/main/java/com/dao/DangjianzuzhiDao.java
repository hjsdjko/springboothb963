package com.dao;

import com.entity.DangjianzuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangjianzuzhiVO;
import com.entity.view.DangjianzuzhiView;


/**
 * 党建组织
 * 
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangjianzuzhiDao extends BaseMapper<DangjianzuzhiEntity> {
	
	List<DangjianzuzhiVO> selectListVO(@Param("ew") Wrapper<DangjianzuzhiEntity> wrapper);
	
	DangjianzuzhiVO selectVO(@Param("ew") Wrapper<DangjianzuzhiEntity> wrapper);
	
	List<DangjianzuzhiView> selectListView(@Param("ew") Wrapper<DangjianzuzhiEntity> wrapper);

	List<DangjianzuzhiView> selectListView(Pagination page,@Param("ew") Wrapper<DangjianzuzhiEntity> wrapper);
	
	DangjianzuzhiView selectView(@Param("ew") Wrapper<DangjianzuzhiEntity> wrapper);
	

}
