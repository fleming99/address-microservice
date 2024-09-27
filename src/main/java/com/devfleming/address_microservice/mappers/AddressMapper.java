package com.devfleming.address_microservice.mappers;

import com.devfleming.address_microservice.core.dto.AddressDto;
import com.devfleming.address_microservice.core.dto.ViaCepDto;
import com.devfleming.address_microservice.core.entities.Address;

public class AddressMapper {

    public static Address mapToAddress(AddressDto addressDto){
        return Address.builder()
                .cep(addressDto.getCep())
                .streetName(addressDto.getStreetName())
                .complement(addressDto.getComplement())
                .city(addressDto.getCity())
                .uf(addressDto.getUf())
                .region(addressDto.getRegion())
                .state(addressDto.getState())
                .ddd(addressDto.getDdd())
                .ibge(addressDto.getIbge())
                .gia(addressDto.getGia())
                .siafi(addressDto.getSiafi())
                .build();
    }

    public static Address mapToAddress(ViaCepDto viaCepDto){
        return Address.builder()
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

    public static AddressDto mapToAddressDto(Address address){
        return AddressDto.builder()
                .cep(address.getCep())
                .streetName(address.getStreetName())
                .complement(address.getComplement())
                .city(address.getCity())
                .uf(address.getUf())
                .region(address.getRegion())
                .state(address.getState())
                .ddd(address.getDdd())
                .ibge(address.getIbge())
                .gia(address.getGia())
                .siafi(address.getSiafi())
                .build();
    }
}
