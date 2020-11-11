package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:28:54
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

