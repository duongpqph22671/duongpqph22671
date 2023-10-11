package com.example.demo.service.impl;

import com.example.demo.entity.NSX;
import com.example.demo.repository.NSXRepository;
import com.example.demo.service.NSXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NSXServiceImpl implements NSXService {
    @Autowired
    private NSXRepository nsxRepository;
    @Override
    public List<NSX> getAll() {
        return nsxRepository.findAll();
    }

    @Override
    public void addNSX(NSX nsx) {
        nsxRepository.save(nsx);
    }

    @Override
    public void removeNSX(UUID id) {
        nsxRepository.deleteById(id);
    }

    @Override
    public NSX detailNSX(UUID id) {
        return nsxRepository.findById(id).orElse(null);
    }

    @Override
    public void updateNSX(UUID id, NSX nsx) {
        NSX nsx1 = nsxRepository.findById(id).get();
        if(nsx1 != null){
            nsx1.setId(nsx.getId());
            nsx1.setMa(nsx.getMa());
            nsx1.setTen(nsx.getTen());
            nsxRepository.save(nsx1);
        }

    }
}
