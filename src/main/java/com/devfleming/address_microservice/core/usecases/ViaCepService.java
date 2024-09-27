package com.devfleming.address_microservice.core.usecases;

import com.devfleming.address_microservice.core.dto.ViaCepDto;
import reactor.core.publisher.Mono;

public interface ViaCepService {

    Mono<ViaCepDto> searchAddressByCEP(String cep);
}
