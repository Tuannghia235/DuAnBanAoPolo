package org.example.duan.service;

import org.example.duan.model.KichThuoc;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KichThuocService {
    List<KichThuoc> getAll();
    List<KichThuoc> getConHang();

}
