package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangzihao
 * @email lxf@atguigu.com
 * @date 2020-11-07 21:52:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
