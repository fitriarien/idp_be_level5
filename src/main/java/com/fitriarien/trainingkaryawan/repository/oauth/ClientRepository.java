package com.fitriarien.trainingkaryawan.repository.oauth;

import com.fitriarien.trainingkaryawan.model.oauth.Client;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

    Client findOneByClientId(String clientId);

}
