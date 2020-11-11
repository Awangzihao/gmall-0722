package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-10 20:20:08
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
