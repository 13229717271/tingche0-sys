package com.lab.thelab.controller;

import com.lab.thelab.entity.Works;
import com.lab.thelab.mapper.WorksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WorksController {
    @Autowired
    private WorksMapper worksMapper;

    //查看工作记录
    @RequestMapping("/worksList")
    public String queryWorksList(Model model){
        List<Works> worksList = worksMapper.queryWorksList();
        model.addAttribute("works",worksList);
        return "assistant/works_list";
    }

    //管理员查看工作内容
    @RequestMapping("/adminworklist")
    public String adminWorksList(Model model){
        List<Works>adminworksList =worksMapper.queryWorksList();
        model.addAttribute("findworks",adminworksList);
        return "admin/work_list";
    }
    //按日期查询
    @GetMapping("/findworkbygtime/{gtime}")
    public String queryWorksBygtime(@PathVariable("gtime")String gtime,Model model){
        Works works = worksMapper.queryWorksBygtime(gtime);
        model.addAttribute("findworkbytime",works);
        return "admin/admin_findwork";
    }

    //添加工作内容
    //1.跳转到添加页面
    @GetMapping("/toaddWorks")
    public String addWorksPage(){
        return "assistant/works_add";
    }
    //2.添加到工作表中
    @PostMapping("/addWorks")
    public String addWorks(Works works){
        worksMapper.addWorks(works);
        return "redirect:/worksList";
    }

    //修改
    //1.跳转到修改页面
    @GetMapping("/worksupdate/{id}")
    public String toupdateWorksPage(@PathVariable("id")Integer id,Model model){
        Works works = worksMapper.queryWorksById(id);
        model.addAttribute("works",works);
        return "assistant/works_update";
    }
    //2.修改到表
    @PostMapping("/update_works")
    public String updateWorks(Works works){
       worksMapper.updateWorks(works);
        return "redirect:/worksList";
    }

    //删除
    @GetMapping("/deleteworks/{id}")
    public String deleteWorks(@PathVariable("id")Integer id){
        worksMapper.deleteWorks(id);
        return "redirect:/worksList";
    }

}
