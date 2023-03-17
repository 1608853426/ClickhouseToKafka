package com.bupt.readfromclickhouse;

import com.bupt.readfromclickhouse.entity.CpuMsgTarget;
import com.bupt.readfromclickhouse.service.impl.NodeResourceServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ReadFromClickhouseApplicationTests {

    @Autowired
    NodeResourceServiceImpl nodeResourceService;

    @Test
    void contextLoads() {
        List<CpuMsgTarget> CpuMsgTargets = this.nodeResourceService.selectList();
        for (CpuMsgTarget cpuMsgTargets : CpuMsgTargets){
            System.out.println(cpuMsgTargets.getMemory());
        }
    }

    @Test
    void test(){
        CpuMsgTarget c = this.nodeResourceService.selectByNode("k8smaster");
        System.out.println(c.getCurrentTime());
    }
}
