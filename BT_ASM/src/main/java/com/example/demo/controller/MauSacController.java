package com.example.demo.controller;

import com.example.demo.entity.MauSac;
import com.example.demo.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MauSacController {
    @Autowired
    private MauSacService mauSacService;
    List<MauSac> lstMauSac;

    @GetMapping("/mau-sac/hien-thi")
    public String hienthi(Model model) {
        lstMauSac = mauSacService.getAll();
        model.addAttribute("listMS", lstMauSac);
        return "/mau_sac/mausac";
    }

}
