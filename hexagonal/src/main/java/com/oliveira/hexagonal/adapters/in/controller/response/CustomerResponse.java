package com.oliveira.hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private AddressResponse addressr;

    private String cpf;

    private Boolean isValidCpf;
}
