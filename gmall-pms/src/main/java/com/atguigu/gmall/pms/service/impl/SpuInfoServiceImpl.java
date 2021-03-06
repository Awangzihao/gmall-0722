package com.atguigu.gmall.pms.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.SpuInfoDao;
import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import com.atguigu.gmall.pms.service.SpuInfoService;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuInfoEntity> page = this.page(
                new Query<SpuInfoEntity>().getPage(params),
                new QueryWrapper<SpuInfoEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo querySpuInfo(QueryCondition queryCondition, Long cid) {
        // 封装查询条件
        QueryWrapper<SpuInfoEntity> queryWrapper = new QueryWrapper<>();
        // 如果分类id不为0，要根据分类id查，否则查全部
        if (cid!=0) {
            queryWrapper.eq("catalog_id",cid);
        }
        // 如果用户输入了检索条件，根据检索条件查
        String key=queryCondition.getKey();
        if (!StringUtils.isEmpty(key)) {
            queryWrapper.and(t->t.like("id",key).or().like("spu_name",key));
        }
        // 封装分页条件
        IPage<SpuInfoEntity> page = new Query<SpuInfoEntity>().getPage(queryCondition);
        PageVo pageVo = new PageVo(this.page(page, queryWrapper));
        return pageVo;
    }



}