package com.bupt.readfromclickhouse.task;


import com.alibaba.fastjson.JSON;
import com.bupt.readfromclickhouse.constants.KafkaConsts;
import com.bupt.readfromclickhouse.entity.CpuMsgTarget;
import com.bupt.readfromclickhouse.service.impl.NodeResourceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WriteOnKafka {

    @Autowired
    private NodeResourceServiceImpl nodeResourceService;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    @Scheduled(cron = "0/1 * * ? * ?")
    public void writeOnKafka(){
        CpuMsgTarget k8smaster = this.nodeResourceService.selectByNode("k8smaster");
        CpuMsgTarget k8snode1 = this.nodeResourceService.selectByNode("k8snode1");
        CpuMsgTarget k8snode2 = this.nodeResourceService.selectByNode("k8snode2");

        this.kafkaTemplate.send(KafkaConsts.MASTER, JSON.toJSONString(k8smaster));
        this.kafkaTemplate.send(KafkaConsts.NODE1,JSON.toJSONString(k8snode1));
        this.kafkaTemplate.send(KafkaConsts.NODE2,JSON.toJSONString(k8snode2));

    }
}
