package com.example.demo.service;

import com.example.demo.entity.DongSP;

import java.util.List;
import java.util.UUID;

public interface DongSPService {
    List<DongSP> getAll();

    void addDongSP(DongSP dongSP);
    void removeDongSP(UUID id);
    DongSP detailDongSP(UUID id);
    void updateDongSP(UUID id,DongSP dongSP);
}
