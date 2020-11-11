package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SeckillSkuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-10 20:20:08
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
