package com.lab.thelab.mapper;

import com.lab.thelab.entity.Word;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordMapper {

    //查询Plan列表
    List<Word> queryWordList();

    //查询单个plan
    Word queryWordById(String wid);

    //添加
    public void addWord(Word word);

    //修改
    public void  updateWord(Word word);

    //删除
    public void  deleteWord(String wid);
}
