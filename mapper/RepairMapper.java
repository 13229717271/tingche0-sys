package com.lab.thelab.mapper;

import com.lab.thelab.entity.Repair;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RepairMapper {
    //查询维修记录
    List<Repair> queryRepairList();
    //查询id
    Repair queryRepairByRid(Integer id);
    //添加
    public void addRepair(Repair repair);

}
