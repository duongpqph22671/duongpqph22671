package com.example.demo.service.impl;

import com.example.demo.entity.SanPham;
import com.example.demo.repository.SanPhamRepository;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void addSanPham(SanPham sanPham) {

    }

    @Override
    public void removeSanPham(UUID id) {

    }

    @Override
    public SanPham detailSanPham(UUID id) {
        return null;
    }

    @Override
    public void updateSanPham(UUID id, SanPham sanPham) {

    }
}
