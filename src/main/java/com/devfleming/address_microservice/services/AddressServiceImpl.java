package com.devfleming.address_microservice.services;

import com.devfleming.address_microservice.adapters.AddressRepository;
import com.devfleming.address_microservice.core.dto.AddressDto;
import com.devfleming.address_microservice.core.dto.ViaCepDto;
import com.devfleming.address_microservice.core.entities.Address;
import com.devfleming.address_microservice.core.usecases.AddressService;
import com.devfleming.address_microservice.core.usecases.ViaCepService;
import com.devfleming.address_microservice.mappers.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Address saveNewAddress(String cep) {

        ViaCepDto viaCepDto = viaCepService.searchAddressByCEP(cep).block();

        if (viaCepDto == null) throw new RuntimeException();

        System.out.println(viaCepDto);

        return addressRepository.save(AddressMapper.mapToAddress(viaCepDto));
    }

    @Override
    public Address updateAddress(Long id, String cep) {

        Optional<Address> address = addressRepository.findById(id);

        ViaCepDto viaCepDto = viaCepService.searchAddressByCEP(cep).block();

        if (address.isEmpty()) throw new RuntimeException();
        if (viaCepDto == null) throw new RuntimeException();

        Address addressToUpdate = address.get();

        addressToUpdate.setCep(viaCepDto.getCep());
        addressToUpdate.setStreetName(viaCepDto.getLogradouro());
        addressToUpdate.setCity(viaCepDto.getLocalidade());
        addressToUpdate.setComplement(viaCepDto.getComplemento());
        addressToUpdate.setState(viaCepDto.getEstado());
        addressToUpdate.setUf(viaCepDto.getUf());
        addressToUpdate.setRegion(viaCepDto.getRegiao());
        addressToUpdate.setDdd(viaCepDto.getDdd());
        addressToUpdate.setGia(viaCepDto.getGia());
        addressToUpdate.setSiafi(viaCepDto.getSiafi());
        addressToUpdate.setIbge(viaCepDto.getIbge());

        return addressRepository.save(addressToUpdate);
    }

    @Override
    public Address fetchSingleAddressById(Long id) {

        Optional<Address> address = addressRepository.findById(id);

        if (address.isEmpty()) throw new RuntimeException();

        return address.get();
    }

    @Override
    public AddressDto fetchSingleAddressDtoById(Long id) {

        Optional<Address> address = addressRepository.findById(id);

        if (address.isEmpty()) throw new RuntimeException();

        return AddressMapper.mapToAddressDto(address.get());
    }

    @Override
    public List<Address> fetchAllAddress() {
        return addressRepository.findAll();
    }
}
