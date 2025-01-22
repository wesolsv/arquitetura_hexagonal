package com.oliveira.hexagonal.adapters.out.client.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;

    public AddressResponse(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public AddressResponse() {
    }

}
