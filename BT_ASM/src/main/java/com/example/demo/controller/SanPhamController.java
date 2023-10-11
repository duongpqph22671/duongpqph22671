package com.example.demo.controller;


import com.example.demo.entity.SanPham;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;
    List<SanPham> lstSanPham;

    @GetMapping("/san-pham/hien-thi")
    public String hienthi(Model model) {
        lstSanPham = sanPhamService.getAll();
        model.addAttribute("listSP", lstSanPham);
        return "/s_p/sanpham";
    }
}
