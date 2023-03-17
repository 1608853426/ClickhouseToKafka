package com.bupt.readfromclickhouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bupt.readfromclickhouse.entity.CpuMsgTarget;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SoonMachine
 */
public interface NodeResourceService extends IService<CpuMsgTarget> {
    CpuMsgTarget selectByNode(@Param("node") String node);

    List<CpuMsgTarget> selectList();
}
