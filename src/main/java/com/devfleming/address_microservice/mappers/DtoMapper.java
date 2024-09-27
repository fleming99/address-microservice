package com.devfleming.address_microservice.mappers;

import com.devfleming.address_microservice.core.dto.AddressDto;
import com.devfleming.address_microservice.core.dto.ViaCepDto;

public class DtoMapper {

    public static AddressDto mapToAddressDto(ViaCepDto viaCepDto){
        return AddressDto.builder()
                .cep(viaCepDto.getCep())
                .streetName(viaCepDto.getLogradouro())
                .complement(viaCepDto.getComplemento())
                .city(viaCepDto.getLocalidade())
                .uf(viaCepDto.getUf())
                .region(viaCepDto.getRegiao())
                .state(viaCepDto.getEstado())
                .ddd(viaCepDto.getDdd())
                .ibge(viaCepDto.getIbge())
                .gia(viaCepDto.getGia())
                .siafi(viaCepDto.getSiafi())
                .build();
    }

    public static ViaCepDto mapToViaCepDto(AddressDto addressDto){
        return ViaCepDto.builder()
                .cep(addressDto.getCep())
                .logradouro(addressDto.getStreetName())
                .complemento(addressDto.getComplement())
                .localidade(addressDto.getCity())
                .uf(addressDto.getUf())
                .regiao(addressDto.getRegion())
                .estado(addressDto.getState())
                .ddd(addressDto.getDdd())
                .ibge(addressDto.getIbge())
                .gia(addressDto.getGia())
                .siafi(addressDto.getSiafi())
                .build();
    }


}
