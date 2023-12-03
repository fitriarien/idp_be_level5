package com.fitriarien.trainingkaryawan.service;

import com.fitriarien.trainingkaryawan.dto.CreateRekeningRequest;
import com.fitriarien.trainingkaryawan.dto.RekeningResponse;
import com.fitriarien.trainingkaryawan.dto.UpdateRekeningRequest;
import org.springframework.data.domain.Page;

public interface RekeningService {
    RekeningResponse insertRekening(CreateRekeningRequest request);
    RekeningResponse updateRekening(UpdateRekeningRequest request);
    Page<RekeningResponse> getAll(int page, int size);
    RekeningResponse getById(Long id);
    void deleteRekening(Long id);
}
