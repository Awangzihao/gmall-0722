package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.HomeSubjectSpuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 专题商品
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-10 20:20:08
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

