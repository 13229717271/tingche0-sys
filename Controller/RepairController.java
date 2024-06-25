package com.lab.thelab.controller;

import com.lab.thelab.entity.Repair;
import com.lab.thelab.mapper.RepairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RepairController {
    @Autowired
    private RepairMapper repairMapper;

    //查看
    @RequestMapping("/repairList")
    public String queryRepairList(Model model){
        List<Repair> repairList = repairMapper.queryRepairList();
        model.addAttribute("repairs",repairList);
        return "assistant/repair_list";
    }
    //管理员查看
    @RequestMapping("/adminrepairList")
    public String adminRepairList(Model model){
        List<Repair> repairList = repairMapper.queryRepairList();
        model.addAttribute("admin_repair",repairList);
        return "admin/admin_repair_list";
    }
    //添加维修申请
    //1.跳转到添加界面
    @GetMapping("toaddrepair")
    public String addRepairPage(){
        return "assistant/repair_add";
    }
    //2.提交表单
    @PostMapping("/addrepair")
    public String addRepair(Repair repair){
        repairMapper.addRepair(repair);
        return "redirect:/repairList";
    }
}
