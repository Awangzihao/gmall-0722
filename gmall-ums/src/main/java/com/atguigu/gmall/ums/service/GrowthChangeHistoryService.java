package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.GrowthChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:19:46
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

