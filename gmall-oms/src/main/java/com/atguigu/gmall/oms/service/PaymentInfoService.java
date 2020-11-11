package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.PaymentInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:12:04
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

