package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品库存
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:28:54
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageVo queryPage(QueryCondition params);
}

