package com.lab.thelab.controller;

import com.lab.thelab.entity.Equip;
import com.lab.thelab.mapper.EquipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EquipController {

    @Autowired
    private EquipMapper equipMapper;

    @RequestMapping("/equips")
    public String queryEquipList(Model model){
        List<Equip> equipList =equipMapper.queryEquipList();
        model.addAttribute("equips",equipList);
        return "xgc/check_equip";
    }
    //管理员列表展示
    @RequestMapping("/admin_equip_list")
    public String adminEquipList(Model model){
        List<Equip> adminequipList =equipMapper.queryEquipList();
        model.addAttribute("equip_list",adminequipList);
        return "admin/equip_list";
    }

    @RequestMapping("/student_equip_list")
    public String studentEquipList(Model model){
        List<Equip> studentequipList =equipMapper.queryEquipList();
        model.addAttribute("student_equip_list",studentequipList);
        return "student/student_equip_list";
    }
//添加
//1.跳转到添加页面
    @GetMapping("/toaddEquip")
    public String addEquipPage(){
        return "admin/addEquip";
    }
//2.提交表单
    @PostMapping("/addEquip")
    public String addEquip(Equip equip){
        equipMapper.addEquip(equip);
        //重定向到列表页面通过接口/admin_equip_list
        return "redirect:/admin_equip_list";
    }

    //修改
    //1.去修改页面
    @GetMapping("/equip/{pid}")
    public String toupdateEquipPage(@PathVariable("eid")String eid,Model model){
      //根据id查询数据
        Equip equip = equipMapper.queryEquipById(eid);
        model.addAttribute("equip",equip);
        return "xgc/updateEquip";
    }
    //2.修改页面数据
    @PostMapping("/updateequip")
    public String updateEquip(Equip equip){
        equipMapper.updateEquip(equip);
        return "redirect:/equips";
    }
    //删除
    @GetMapping("/delequip/{eid}")
    public String deleteEquip(@PathVariable("eid")String pid){
        equipMapper.deleteEquip(pid);
        return "redirect:/equips";
    }
}
