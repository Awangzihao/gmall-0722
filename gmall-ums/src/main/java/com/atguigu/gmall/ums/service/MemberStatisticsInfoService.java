package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberStatisticsInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:19:46
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

