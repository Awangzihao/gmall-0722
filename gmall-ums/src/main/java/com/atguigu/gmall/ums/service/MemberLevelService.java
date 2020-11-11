package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberLevelEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员等级
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:19:46
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageVo queryPage(QueryCondition params);
}

