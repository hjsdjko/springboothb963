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

import com.entity.RudangziliaoEntity;
import com.entity.view.RudangziliaoView;

import com.service.RudangziliaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 入党资料
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-03 15:49:31
 */
@RestController
@RequestMapping("/rudangziliao")
public class RudangziliaoController {
    @Autowired
    private RudangziliaoService rudangziliaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RudangziliaoEntity rudangziliao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			rudangziliao.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RudangziliaoEntity> ew = new EntityWrapper<RudangziliaoEntity>();
		PageUtils page = rudangziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rudangziliao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RudangziliaoEntity rudangziliao, 
		HttpServletRequest request){
        EntityWrapper<RudangziliaoEntity> ew = new EntityWrapper<RudangziliaoEntity>();
		PageUtils page = rudangziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rudangziliao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RudangziliaoEntity rudangziliao){
       	EntityWrapper<RudangziliaoEntity> ew = new EntityWrapper<RudangziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( rudangziliao, "rudangziliao")); 
        return R.ok().put("data", rudangziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RudangziliaoEntity rudangziliao){
        EntityWrapper< RudangziliaoEntity> ew = new EntityWrapper< RudangziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( rudangziliao, "rudangziliao")); 
		RudangziliaoView rudangziliaoView =  rudangziliaoService.selectView(ew);
		return R.ok("查询入党资料成功").put("data", rudangziliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RudangziliaoEntity rudangziliao = rudangziliaoService.selectById(id);
        return R.ok().put("data", rudangziliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RudangziliaoEntity rudangziliao = rudangziliaoService.selectById(id);
        return R.ok().put("data", rudangziliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RudangziliaoEntity rudangziliao, HttpServletRequest request){
    	rudangziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rudangziliao);
        rudangziliaoService.insert(rudangziliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RudangziliaoEntity rudangziliao, HttpServletRequest request){
    	rudangziliao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rudangziliao);
        rudangziliaoService.insert(rudangziliao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RudangziliaoEntity rudangziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(rudangziliao);
        rudangziliaoService.updateById(rudangziliao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        rudangziliaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RudangziliaoEntity> wrapper = new EntityWrapper<RudangziliaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = rudangziliaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
