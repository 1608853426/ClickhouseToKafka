package com.bupt.readfromclickhouse.constants;

/**
 * @author SoonMachine
 */
public interface KafkaConsts {
    /**
     * 默认分区大小
     */
    Integer DEFAULT_PARTITION_NUM = 3;

    /**
     * Topic 名称
     */
    String MASTER = "k8s_master";

    String NODE1 = "k8s_node1";

    String NODE2 = "k8s_node2";
}
