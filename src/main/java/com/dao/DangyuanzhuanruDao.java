package com.dao;

import com.entity.DangyuanzhuanruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangyuanzhuanruVO;
import com.entity.view.DangyuanzhuanruView;


/**
 * 党员转入
 * 
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
public interface DangyuanzhuanruDao extends BaseMapper<DangyuanzhuanruEntity> {
	
	List<DangyuanzhuanruVO> selectListVO(@Param("ew") Wrapper<DangyuanzhuanruEntity> wrapper);
	
	DangyuanzhuanruVO selectVO(@Param("ew") Wrapper<DangyuanzhuanruEntity> wrapper);
	
	List<DangyuanzhuanruView> selectListView(@Param("ew") Wrapper<DangyuanzhuanruEntity> wrapper);

	List<DangyuanzhuanruView> selectListView(Pagination page,@Param("ew") Wrapper<DangyuanzhuanruEntity> wrapper);
	
	DangyuanzhuanruView selectView(@Param("ew") Wrapper<DangyuanzhuanruEntity> wrapper);
	

}
