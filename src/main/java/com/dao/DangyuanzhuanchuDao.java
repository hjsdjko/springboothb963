package com.dao;

import com.entity.DangyuanzhuanchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanzhuanchuVO;
import com.entity.view.DangyuanzhuanchuView;


/**
 * 党员转出
 * 
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangyuanzhuanchuDao extends BaseMapper<DangyuanzhuanchuEntity> {
	
	List<DangyuanzhuanchuVO> selectListVO(@Param("ew") Wrapper<DangyuanzhuanchuEntity> wrapper);
	
	DangyuanzhuanchuVO selectVO(@Param("ew") Wrapper<DangyuanzhuanchuEntity> wrapper);
	
	List<DangyuanzhuanchuView> selectListView(@Param("ew") Wrapper<DangyuanzhuanchuEntity> wrapper);

	List<DangyuanzhuanchuView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanzhuanchuEntity> wrapper);
	
	DangyuanzhuanchuView selectView(@Param("ew") Wrapper<DangyuanzhuanchuEntity> wrapper);
	

}
