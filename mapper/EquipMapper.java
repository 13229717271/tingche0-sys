package com.lab.thelab.mapper;

import com.lab.thelab.entity.Equip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper   //mybatis的mapper类
@Repository
public interface EquipMapper {


    List<Equip> queryEquipList();


    Equip queryEquipById(String eid);

    //添加
    public void addEquip(Equip equip);

    //修改
    public void  updateEquip(Equip equip);

    //删除
    public void  deleteEquip(String eid);
}
