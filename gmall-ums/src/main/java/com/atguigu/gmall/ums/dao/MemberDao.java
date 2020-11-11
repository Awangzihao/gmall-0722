package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-11 13:19:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
