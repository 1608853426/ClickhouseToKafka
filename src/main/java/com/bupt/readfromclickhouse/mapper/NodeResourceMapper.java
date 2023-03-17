package com.bupt.readfromclickhouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bupt.readfromclickhouse.entity.CpuMsgTarget;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SoonMachine
 */
@Repository
public interface NodeResourceMapper extends BaseMapper<CpuMsgTarget> {

    CpuMsgTarget selectByNode(@Param("node") String node);

    List<CpuMsgTarget> selectList();


}
