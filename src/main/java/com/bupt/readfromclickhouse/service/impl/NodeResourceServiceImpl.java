package com.bupt.readfromclickhouse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bupt.readfromclickhouse.entity.CpuMsgTarget;
import com.bupt.readfromclickhouse.mapper.NodeResourceMapper;
import com.bupt.readfromclickhouse.service.NodeResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeResourceServiceImpl extends ServiceImpl<NodeResourceMapper, CpuMsgTarget> implements NodeResourceService {

    @Autowired
    NodeResourceMapper nodeResourceMapper;

    @Override
    public CpuMsgTarget selectByNode(String node) {
        return this.nodeResourceMapper.selectByNode(node);
    }

    @Override
    public List<CpuMsgTarget> selectList() {
        return this.nodeResourceMapper.selectList();
    }
}
