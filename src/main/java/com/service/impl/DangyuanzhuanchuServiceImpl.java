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


import com.dao.DangyuanzhuanchuDao;
import com.entity.DangyuanzhuanchuEntity;
import com.service.DangyuanzhuanchuService;
import com.entity.vo.DangyuanzhuanchuVO;
import com.entity.view.DangyuanzhuanchuView;

@Service("dangyuanzhuanchuService")
public class DangyuanzhuanchuServiceImpl extends ServiceImpl<DangyuanzhuanchuDao, DangyuanzhuanchuEntity> implements DangyuanzhuanchuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanzhuanchuEntity> page = this.selectPage(
                new Query<DangyuanzhuanchuEntity>(params).getPage(),
                new EntityWrapper<DangyuanzhuanchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanzhuanchuEntity> wrapper) {
		  Page<DangyuanzhuanchuView> page =new Query<DangyuanzhuanchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanzhuanchuVO> selectListVO(Wrapper<DangyuanzhuanchuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanzhuanchuVO selectVO(Wrapper<DangyuanzhuanchuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanzhuanchuView> selectListView(Wrapper<DangyuanzhuanchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanzhuanchuView selectView(Wrapper<DangyuanzhuanchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
