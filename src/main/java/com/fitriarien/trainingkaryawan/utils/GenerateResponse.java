package com.fitriarien.trainingkaryawan.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenerateResponse<T> {
    private Integer code;
    private T data;
    private String status;
}
