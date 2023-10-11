package com.example.demo.controller;

import com.example.demo.entity.DongSP;
import com.example.demo.service.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DongSPController {
    @Autowired
    private DongSPService dongSPService;
    List<DongSP> lstDongSP;

    @GetMapping("/dong-sp/hien-thi")
    public String hienthi(Model model){
        lstDongSP = dongSPService.getAll();
        model.addAttribute("listDSP",lstDongSP);
        return "/dong_sp/dongsp";
    }
}
