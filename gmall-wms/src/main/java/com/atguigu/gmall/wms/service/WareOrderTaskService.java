package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareOrderTaskEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:28:54
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

