package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.ShAreaEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 全国省市区信息
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:28:54
 */
public interface ShAreaService extends IService<ShAreaEntity> {

    PageVo queryPage(QueryCondition params);
}

