package com.fitriarien.trainingkaryawan.repository;

import com.fitriarien.trainingkaryawan.model.DetailKaryawan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailKaryawanRepository extends JpaRepository<DetailKaryawan, Long> {
}
