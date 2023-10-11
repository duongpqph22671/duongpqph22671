package com.example.demo.service.impl;

import com.example.demo.entity.DongSP;
import com.example.demo.repository.DongSPRepository;
import com.example.demo.service.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DongSPServiceImpl implements DongSPService {
    @Autowired
    private DongSPRepository dongSPRepository;
    @Override
    public List<DongSP> getAll() {
        return dongSPRepository.findAll();
    }

    @Override
    public void addDongSP(DongSP dongSP) {
        dongSPRepository.save(dongSP);
    }

    @Override
    public void removeDongSP(UUID id) {
        dongSPRepository.deleteById(id);
    }

    @Override
    public DongSP detailDongSP(UUID id) {
        return dongSPRepository.findById(id).orElse(null);
    }

    @Override
    public void updateDongSP(UUID id, DongSP dongSP) {

    }
}
