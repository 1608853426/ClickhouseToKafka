package com.bupt.readfromclickhouse.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SoonMachine
 */
@Data
public class CpuMsgTarget implements Serializable {


    private static final long serialVersionUID = -3224936273253308880L;

    private String node;

    private String cpu;

    private String cpuPercent;

    private String memory;

    private String memoryPercent;

    @TableId(value = "current_time")
    private Long currentTime;

    private Date eventTime;
}
