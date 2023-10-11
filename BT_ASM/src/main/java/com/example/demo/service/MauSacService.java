package com.example.demo.service;

import com.example.demo.entity.MauSac;

import java.util.List;
import java.util.UUID;

public interface MauSacService {
    List<MauSac> getAll();
    void addMauSac(MauSac mauSac);
    void removeMauSac(UUID id);
    MauSac detailMauSac(UUID id);
    void updateMauSac(UUID id, MauSac mauSac);
}
