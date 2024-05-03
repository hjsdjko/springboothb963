package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DangtuanhuodongDao;
import com.entity.DangtuanhuodongEntity;
import com.service.DangtuanhuodongService;
import com.entity.vo.DangtuanhuodongVO;
import com.entity.view.DangtuanhuodongView;

@Service("dangtuanhuodongService")
public class DangtuanhuodongServiceImpl extends ServiceImpl<DangtuanhuodongDao, DangtuanhuodongEntity> implements DangtuanhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangtuanhuodongEntity> page = this.selectPage(
                new Query<DangtuanhuodongEntity>(params).getPage(),
                new EntityWrapper<DangtuanhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangtuanhuodongEntity> wrapper) {
		  Page<DangtuanhuodongView> page =new Query<DangtuanhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangtuanhuodongVO> selectListVO(Wrapper<DangtuanhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangtuanhuodongVO selectVO(Wrapper<DangtuanhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangtuanhuodongView> selectListView(Wrapper<DangtuanhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangtuanhuodongView selectView(Wrapper<DangtuanhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
