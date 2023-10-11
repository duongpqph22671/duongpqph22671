package com.example.demo.service;

import com.example.demo.entity.NSX;


import java.util.List;
import java.util.UUID;

public interface NSXService {
    List<NSX> getAll();

    void addNSX(NSX nsx);

    void removeNSX(UUID id);

    NSX detailNSX(UUID id);

    void updateNSX(UUID id, NSX nsx);
}
