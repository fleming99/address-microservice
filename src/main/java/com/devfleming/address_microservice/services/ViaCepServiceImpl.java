package com.devfleming.address_microservice.services;

import com.devfleming.address_microservice.core.dto.ViaCepDto;
import com.devfleming.address_microservice.core.usecases.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ViaCepServiceImpl implements ViaCepService {

    private final WebClient webClient;

    public ViaCepServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<ViaCepDto> searchAddressByCEP(String cep){
        return this.webClient
                .get()
                .uri("{cep}/json/", cep)
                .retrieve()
                .bodyToMono(ViaCepDto.class);
    }
}
