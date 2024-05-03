package com.dao;

import com.entity.JiaofeitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaofeitongjiVO;
import com.entity.view.JiaofeitongjiView;


/**
 * 缴费统计
 * 
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface JiaofeitongjiDao extends BaseMapper<JiaofeitongjiEntity> {
	
	List<JiaofeitongjiVO> selectListVO(@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);
	
	JiaofeitongjiVO selectVO(@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);
	
	List<JiaofeitongjiView> selectListView(@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);

	List<JiaofeitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);
	
	JiaofeitongjiView selectView(@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiaofeitongjiEntity> wrapper);
}
