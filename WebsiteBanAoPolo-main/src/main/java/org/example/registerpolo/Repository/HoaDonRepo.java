package org.example.registerpolo.Repository;

import org.example.registerpolo.Entity.HoaDon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;


@Repository
public interface HoaDonRepo extends JpaRepository<HoaDon, Integer> {
    Page<HoaDon> findAll(Pageable pageable);
    // Tìm kiếm hóa đơn theo khoảng thời gian
    Page<HoaDon> findByKhachHangSdtContaining(String sdt, Pageable pageable);

    Page<HoaDon> findByNgayMuaHangBetween(LocalDate startDate, LocalDate endDate, Pageable pageable);

    // Không cần thêm findById vì JpaRepository đã có sẵn

}

