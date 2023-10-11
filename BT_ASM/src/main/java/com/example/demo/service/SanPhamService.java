package com.example.demo.service;

import com.example.demo.entity.SanPham;

import java.util.List;
import java.util.UUID;

public interface SanPhamService {
    List<SanPham> getAll();
    void addSanPham(SanPham sanPham);
    void removeSanPham(UUID id);
    SanPham detailSanPham(UUID id);
    void updateSanPham(UUID id, SanPham sanPham);
}
