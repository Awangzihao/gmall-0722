package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberLoginLogEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员登录记录
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:19:46
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageVo queryPage(QueryCondition params);
}

