package org.example.duan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "SanPham")
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Ma", nullable = false, length = 50)
    private String ma;

    @Nationalized
    @Column(name = "Ten", nullable = false)
    private String ten;

    @Column(name = "TrangThai")
    private Boolean trangThai;

}