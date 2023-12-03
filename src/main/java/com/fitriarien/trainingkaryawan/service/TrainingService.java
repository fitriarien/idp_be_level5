package com.fitriarien.trainingkaryawan.service;

import com.fitriarien.trainingkaryawan.dto.CreateTrainingRequest;
import com.fitriarien.trainingkaryawan.dto.UpdateTrainingRequest;
import com.fitriarien.trainingkaryawan.model.Training;
import org.springframework.data.domain.Page;

public interface TrainingService {
    Training createTraining(CreateTrainingRequest request);
    Training updateTraining(UpdateTrainingRequest request);
    Page<Training> getAll(int page, int size);
    Training getById(Long id);
    void delete(Long id);
}
