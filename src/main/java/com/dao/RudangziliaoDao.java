package com.dao;

import com.entity.RudangziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RudangziliaoVO;
import com.entity.view.RudangziliaoView;


/**
 * 入党资料
 * 
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface RudangziliaoDao extends BaseMapper<RudangziliaoEntity> {
	
	List<RudangziliaoVO> selectListVO(@Param("ew") Wrapper<RudangziliaoEntity> wrapper);
	
	RudangziliaoVO selectVO(@Param("ew") Wrapper<RudangziliaoEntity> wrapper);
	
	List<RudangziliaoView> selectListView(@Param("ew") Wrapper<RudangziliaoEntity> wrapper);

	List<RudangziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<RudangziliaoEntity> wrapper);
	
	RudangziliaoView selectView(@Param("ew") Wrapper<RudangziliaoEntity> wrapper);
	

}
