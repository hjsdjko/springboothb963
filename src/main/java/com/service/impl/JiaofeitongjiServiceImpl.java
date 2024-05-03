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


import com.dao.JiaofeitongjiDao;
import com.entity.JiaofeitongjiEntity;
import com.service.JiaofeitongjiService;
import com.entity.vo.JiaofeitongjiVO;
import com.entity.view.JiaofeitongjiView;

@Service("jiaofeitongjiService")
public class JiaofeitongjiServiceImpl extends ServiceImpl<JiaofeitongjiDao, JiaofeitongjiEntity> implements JiaofeitongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaofeitongjiEntity> page = this.selectPage(
                new Query<JiaofeitongjiEntity>(params).getPage(),
                new EntityWrapper<JiaofeitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaofeitongjiEntity> wrapper) {
		  Page<JiaofeitongjiView> page =new Query<JiaofeitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaofeitongjiVO> selectListVO(Wrapper<JiaofeitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaofeitongjiVO selectVO(Wrapper<JiaofeitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaofeitongjiView> selectListView(Wrapper<JiaofeitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaofeitongjiView selectView(Wrapper<JiaofeitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JiaofeitongjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JiaofeitongjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JiaofeitongjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
