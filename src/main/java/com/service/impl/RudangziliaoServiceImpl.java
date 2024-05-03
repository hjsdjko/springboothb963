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


import com.dao.RudangziliaoDao;
import com.entity.RudangziliaoEntity;
import com.service.RudangziliaoService;
import com.entity.vo.RudangziliaoVO;
import com.entity.view.RudangziliaoView;

@Service("rudangziliaoService")
public class RudangziliaoServiceImpl extends ServiceImpl<RudangziliaoDao, RudangziliaoEntity> implements RudangziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RudangziliaoEntity> page = this.selectPage(
                new Query<RudangziliaoEntity>(params).getPage(),
                new EntityWrapper<RudangziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RudangziliaoEntity> wrapper) {
		  Page<RudangziliaoView> page =new Query<RudangziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RudangziliaoVO> selectListVO(Wrapper<RudangziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RudangziliaoVO selectVO(Wrapper<RudangziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RudangziliaoView> selectListView(Wrapper<RudangziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RudangziliaoView selectView(Wrapper<RudangziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
