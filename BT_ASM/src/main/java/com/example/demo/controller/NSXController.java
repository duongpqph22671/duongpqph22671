package com.example.demo.controller;

import com.example.demo.entity.NSX;
import com.example.demo.service.NSXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class NSXController {
    @Autowired
    private NSXService nsxService;
    List<NSX> lstNSX;
    @GetMapping("/n-sx/hien-thi")
    public String hienthi(Model model){
        lstNSX = nsxService.getAll();
        model.addAttribute("listNSX",lstNSX);
        return "/n_sx/nsx";
    }
    @GetMapping("/n-sx/detail/{id}")
    public String detail(@PathVariable("id")UUID id, Model model){
        NSX nsx = nsxService.detailNSX(id);
        model.addAttribute("nsx1",nsx);
        model.addAttribute("listNSX",lstNSX);
        return "/n_sx/nsx";
    }
    @PostMapping("/n-sx/add")
    public String add(@ModelAttribute NSX nsx,Model model){
        model.addAttribute("listNSX",lstNSX);
        nsxService.addNSX(nsx);
        return "redirect:/n-sx/hien-thi";
    }
    @GetMapping("/n-sx/remove/{id}")
    public String remove(@PathVariable("id") UUID id){
        nsxService.removeNSX(id);
        return "redirect:/n-sx/hien-thi";
    }
    @GetMapping("/n-sx/view-update/{id}")
    public String viewupdate(@PathVariable("id") UUID id, Model model){
        NSX nsx = nsxService.detailNSX(id);
        model.addAttribute("nsx1",nsx);
        nsxService.addNSX(nsx);
        return "/n_sx/update";
    }
    @PostMapping("/n-sx/update")
    public String update(@RequestParam("id") UUID id,
                         @RequestParam("ma") String ma,
                         @RequestParam("ten") String ten
    ){
            NSX nsx1 = NSX.builder().id(id).ma(ma).ten(ten).build();
        nsxService.updateNSX(id,nsx1);
        return "redirect:/n-sx/hien-thi";
    }

}
