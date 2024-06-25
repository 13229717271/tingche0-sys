package com.lab.thelab.mapper;

import com.lab.thelab.entity.Works;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WorksMapper {
    //查询工作记录
    List<Works> queryWorksList();
    //查询id
    Works queryWorksById(Integer id);
     //添加
     public void addWorks(Works work);

    //修改
     public void updateWorks(Works work);

     //删除
      public void deleteWorks(Integer id);
      //根据时间查询工作记录
     Works queryWorksBygtime(String gtime);

}
