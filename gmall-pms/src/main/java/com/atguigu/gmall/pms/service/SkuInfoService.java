package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku信息
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-07 21:52:52
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

