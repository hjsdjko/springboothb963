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


import com.dao.DangjianzuzhiDao;
import com.entity.DangjianzuzhiEntity;
import com.service.DangjianzuzhiService;
import com.entity.vo.DangjianzuzhiVO;
import com.entity.view.DangjianzuzhiView;

@Service("dangjianzuzhiService")
public class DangjianzuzhiServiceImpl extends ServiceImpl<DangjianzuzhiDao, DangjianzuzhiEntity> implements DangjianzuzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangjianzuzhiEntity> page = this.selectPage(
                new Query<DangjianzuzhiEntity>(params).getPage(),
                new EntityWrapper<DangjianzuzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangjianzuzhiEntity> wrapper) {
		  Page<DangjianzuzhiView> page =new Query<DangjianzuzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangjianzuzhiVO> selectListVO(Wrapper<DangjianzuzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangjianzuzhiVO selectVO(Wrapper<DangjianzuzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangjianzuzhiView> selectListView(Wrapper<DangjianzuzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangjianzuzhiView selectView(Wrapper<DangjianzuzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
