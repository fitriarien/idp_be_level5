package com.fitriarien.trainingkaryawan.service;

import com.fitriarien.trainingkaryawan.dto.CreateKaryawanTrainingRequest;
import com.fitriarien.trainingkaryawan.dto.UpdateKaryawanTrainingRequest;
import com.fitriarien.trainingkaryawan.model.KaryawanTraining;
import org.springframework.data.domain.Page;

public interface KaryawanTrainingService {
    KaryawanTraining create(CreateKaryawanTrainingRequest request);
    KaryawanTraining update(UpdateKaryawanTrainingRequest request);
    Page<KaryawanTraining> getAll(int page, int size);
    KaryawanTraining getById(Long id);
    void delete(Long id);
}
