package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SeckillSessionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 秒杀活动场次
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-10 20:20:08
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageVo queryPage(QueryCondition params);
}

