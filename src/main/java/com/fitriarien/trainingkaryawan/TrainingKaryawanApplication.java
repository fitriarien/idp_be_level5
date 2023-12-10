package com.fitriarien.trainingkaryawan;

import com.fitriarien.trainingkaryawan.controller.fileupload.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class TrainingKaryawanApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingKaryawanApplication.class, args);
    }

}
