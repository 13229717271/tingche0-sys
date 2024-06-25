package com.lab.thelab.controller;

import com.lab.thelab.entity.Word;
import com.lab.thelab.mapper.WordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
public class WordController {

    @Autowired
    private WordMapper wordMapper;

    @RequestMapping("/words")
    public String queryWordList(Model model){
        List<Word> wordList =wordMapper.queryWordList();
        model.addAttribute("words",wordList);
        return "admin/word_list";
    }
    //管理员列表展示
    @RequestMapping("/admin_word_list")
    public String adminWordList(Model model){
        List<Word> adminwordList =wordMapper.queryWordList();
        model.addAttribute("word_list",adminwordList);
        return "admin/word_list";
    }
    //业主查看列表
    @RequestMapping("/student_word_list")
    public String studentWordList(Model model){
        List<Word> studentwordList =wordMapper.queryWordList();
        model.addAttribute("student_word_list",studentwordList);
        return "student/student_word_list";
    }

    //添加
//1.跳转到添加页面

    @GetMapping("/toaddWord")
    public String addWordPage(){
        return "student/student_add_word";
    }
    //2.提交表单

    @PostMapping("/addWord")
    public String addWord(Word word){
        wordMapper.addWord(word);
        return "redirect:/student_word_list";
    }

    //删除
    @GetMapping("/delword/{wid}")
    public String deleteWord(@PathVariable("wid")String wid){
        wordMapper.deleteWord(wid);
        return "redirect:/student_word_list";
    }
}