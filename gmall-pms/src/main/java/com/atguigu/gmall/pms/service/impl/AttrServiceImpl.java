package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.gmall.pms.vo.AttrVo;
import org.bouncycastle.cert.ocsp.jcajce.JcaCertificateID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.AttrDao;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.gmall.pms.service.AttrService;
import org.springframework.transaction.annotation.Transactional;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {
    @Autowired
    private AttrDao attrDao;
    @Autowired
    private AttrAttrgroupRelationDao attrAttrgroupRelationDao;

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo queryAttrsByCid(Long cid, Integer type, QueryCondition queryCondition) {
        QueryWrapper<AttrEntity> queryWrapper=new QueryWrapper();
        if (cid != null) {
            queryWrapper.eq("catelog_id",cid);
        }
        if (type != null) {
            queryWrapper.eq("attr_type",type);
        }
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(queryCondition),
                queryWrapper
        );
        return new PageVo(page);
    }

    @Override
    @Transactional
    public void saveAttr(AttrVo attrVo) {
        //添加商品属性
        this.attrDao.insert(attrVo);
        //添加商品中间表
        AttrAttrgroupRelationEntity attrAttrgroupRelationEntity=new AttrAttrgroupRelationEntity();
        attrAttrgroupRelationEntity.setAttrGroupId(attrVo.getAttrGroupId());
        attrAttrgroupRelationEntity.setAttrId(attrVo.getAttrId());
        this.attrAttrgroupRelationDao.insert(attrAttrgroupRelationEntity);
    }
}