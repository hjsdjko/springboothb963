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


import com.dao.DangyuanzhuanruDao;
import com.entity.DangyuanzhuanruEntity;
import com.service.DangyuanzhuanruService;
import com.entity.vo.DangyuanzhuanruVO;
import com.entity.view.DangyuanzhuanruView;

@Service("dangyuanzhuanruService")
public class DangyuanzhuanruServiceImpl extends ServiceImpl<DangyuanzhuanruDao, DangyuanzhuanruEntity> implements DangyuanzhuanruService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangyuanzhuanruEntity> page = this.selectPage(
                new Query<DangyuanzhuanruEntity>(params).getPage(),
                new EntityWrapper<DangyuanzhuanruEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangyuanzhuanruEntity> wrapper) {
		  Page<DangyuanzhuanruView> page =new Query<DangyuanzhuanruView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangyuanzhuanruVO> selectListVO(Wrapper<DangyuanzhuanruEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangyuanzhuanruVO selectVO(Wrapper<DangyuanzhuanruEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangyuanzhuanruView> selectListView(Wrapper<DangyuanzhuanruEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangyuanzhuanruView selectView(Wrapper<DangyuanzhuanruEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
