package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:19:46
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
