package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-07 21:52:52
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

