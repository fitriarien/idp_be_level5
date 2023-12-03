package com.fitriarien.trainingkaryawan.repository;

import com.fitriarien.trainingkaryawan.model.Karyawan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaryawanRepository extends PagingAndSortingRepository<Karyawan, Long> {
}
