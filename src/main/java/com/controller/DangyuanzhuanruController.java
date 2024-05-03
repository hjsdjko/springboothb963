package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DangyuanzhuanruEntity;
import com.entity.view.DangyuanzhuanruView;

import com.service.DangyuanzhuanruService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 党员转入
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@RestController
@RequestMapping("/dangyuanzhuanru")
public class DangyuanzhuanruController {
    @Autowired
    private DangyuanzhuanruService dangyuanzhuanruService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DangyuanzhuanruEntity dangyuanzhuanru,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dangyuan")) {
			dangyuanzhuanru.setDangyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DangyuanzhuanruEntity> ew = new EntityWrapper<DangyuanzhuanruEntity>();
		PageUtils page = dangyuanzhuanruService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangyuanzhuanru), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DangyuanzhuanruEntity dangyuanzhuanru, 
		HttpServletRequest request){
        EntityWrapper<DangyuanzhuanruEntity> ew = new EntityWrapper<DangyuanzhuanruEntity>();
		PageUtils page = dangyuanzhuanruService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangyuanzhuanru), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DangyuanzhuanruEntity dangyuanzhuanru){
       	EntityWrapper<DangyuanzhuanruEntity> ew = new EntityWrapper<DangyuanzhuanruEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dangyuanzhuanru, "dangyuanzhuanru")); 
        return R.ok().put("data", dangyuanzhuanruService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DangyuanzhuanruEntity dangyuanzhuanru){
        EntityWrapper< DangyuanzhuanruEntity> ew = new EntityWrapper< DangyuanzhuanruEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dangyuanzhuanru, "dangyuanzhuanru")); 
		DangyuanzhuanruView dangyuanzhuanruView =  dangyuanzhuanruService.selectView(ew);
		return R.ok("查询党员转入成功").put("data", dangyuanzhuanruView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DangyuanzhuanruEntity dangyuanzhuanru = dangyuanzhuanruService.selectById(id);
        return R.ok().put("data", dangyuanzhuanru);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DangyuanzhuanruEntity dangyuanzhuanru = dangyuanzhuanruService.selectById(id);
        return R.ok().put("data", dangyuanzhuanru);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DangyuanzhuanruEntity dangyuanzhuanru, HttpServletRequest request){
    	dangyuanzhuanru.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dangyuanzhuanru);
        dangyuanzhuanruService.insert(dangyuanzhuanru);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DangyuanzhuanruEntity dangyuanzhuanru, HttpServletRequest request){
    	dangyuanzhuanru.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dangyuanzhuanru);
        dangyuanzhuanruService.insert(dangyuanzhuanru);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DangyuanzhuanruEntity dangyuanzhuanru, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dangyuanzhuanru);
        dangyuanzhuanruService.updateById(dangyuanzhuanru);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dangyuanzhuanruService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DangyuanzhuanruEntity> wrapper = new EntityWrapper<DangyuanzhuanruEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("dangyuan")) {
			wrapper.eq("dangyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = dangyuanzhuanruService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
