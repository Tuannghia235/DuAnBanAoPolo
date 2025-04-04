package org.example.duan.repository;

import org.example.duan.model.KichThuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KichThuocRepo extends JpaRepository<KichThuoc, Integer> {
    @Query(value = "select kt from KichThuoc ",nativeQuery = true)
    List<KichThuoc> getConHang();
}
