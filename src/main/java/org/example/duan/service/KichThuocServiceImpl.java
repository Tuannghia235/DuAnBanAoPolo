package org.example.duan.service;

import org.example.duan.model.KichThuoc;
import org.example.duan.repository.KichThuocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KichThuocServiceImpl implements KichThuocService{

    @Autowired
    private KichThuocRepo repo;

    @Override
    public List<KichThuoc> getAll() {
        return repo.findAll();
    }

    @Override
    public List<KichThuoc> getConHang() {
        return repo.getConHang();
    }
}
