package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.FeightTemplateEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:28:54
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

