package com.devfleming.address_microservice.core.usecases;

import com.devfleming.address_microservice.core.dto.AddressDto;
import com.devfleming.address_microservice.core.entities.Address;

import java.util.List;

public interface AddressService {

    Address saveNewAddress(String cep);

    Address updateAddress(Long id, String cep);

    Address fetchSingleAddressById(Long id);

    AddressDto fetchSingleAddressDtoById(Long id);

    List<Address> fetchAllAddress();
}
