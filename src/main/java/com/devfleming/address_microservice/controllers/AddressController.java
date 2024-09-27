package com.devfleming.address_microservice.controllers;

import com.devfleming.address_microservice.core.dto.AddressDto;
import com.devfleming.address_microservice.core.dto.ResponseDto;
import com.devfleming.address_microservice.core.entities.Address;
import com.devfleming.address_microservice.core.usecases.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.devfleming.address_microservice.constants.AddressConstants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
@ControllerAdvice
public class AddressController {

    private final AddressService addressService;

    @PostMapping("/address")
    public ResponseEntity<ResponseDto> createNewAddress(@RequestBody String cep){
        addressService.saveNewAddress(cep);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(STATUS_201, MESSAGE_201));
    }

    @PutMapping("/address/{addressId}")
    public ResponseEntity<ResponseDto> updateAddress(@PathVariable Long addressId, @RequestBody String cep){
        addressService.updateAddress(addressId,cep);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseDto(STATUS_200, MESSAGE_200));
    }

    @GetMapping("/address/details/{addressId}")
    public Address fetchAddressById(@PathVariable Long addressId){
        return addressService.fetchSingleAddressById(addressId);
    }

    @GetMapping("/address/fetch-all")
    public List<Address> fetchAllAddress(){
        return addressService.fetchAllAddress();
    }

    @GetMapping("/address/summary/{addressId}")
    public AddressDto fetchAddressDtoById(@PathVariable Long addressId){
        return addressService.fetchSingleAddressDtoById(addressId);
    }
}
