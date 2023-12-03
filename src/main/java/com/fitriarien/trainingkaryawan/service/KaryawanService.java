package com.fitriarien.trainingkaryawan.service;

import com.fitriarien.trainingkaryawan.dto.CreateKaryawanRequest;
import com.fitriarien.trainingkaryawan.dto.UpdateKaryawanRequest;
import com.fitriarien.trainingkaryawan.model.Karyawan;
import org.springframework.data.domain.Page;

public interface KaryawanService {
    Karyawan insertKaryawanAndDetail(CreateKaryawanRequest request);
    Karyawan updateKaryawanAndDetail(UpdateKaryawanRequest request);
    Page<Karyawan> getAll(int page, int size);
    Karyawan getById(Long id);
    void deleteKaryawan(Long id);
}
