package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:12:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
