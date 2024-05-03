package com.dao;

import com.entity.DangtuanhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangtuanhuodongVO;
import com.entity.view.DangtuanhuodongView;


/**
 * 党团活动
 * 
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangtuanhuodongDao extends BaseMapper<DangtuanhuodongEntity> {
	
	List<DangtuanhuodongVO> selectListVO(@Param("ew") Wrapper<DangtuanhuodongEntity> wrapper);
	
	DangtuanhuodongVO selectVO(@Param("ew") Wrapper<DangtuanhuodongEntity> wrapper);
	
	List<DangtuanhuodongView> selectListView(@Param("ew") Wrapper<DangtuanhuodongEntity> wrapper);

	List<DangtuanhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DangtuanhuodongEntity> wrapper);
	
	DangtuanhuodongView selectView(@Param("ew") Wrapper<DangtuanhuodongEntity> wrapper);
	

}
