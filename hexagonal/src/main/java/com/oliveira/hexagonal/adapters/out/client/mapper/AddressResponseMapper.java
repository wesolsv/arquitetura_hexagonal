package com.oliveira.hexagonal.adapters.out.client.mapper;

import com.oliveira.hexagonal.adapters.out.client.response.AddressResponse;
import com.oliveira.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
