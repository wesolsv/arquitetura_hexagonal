package com.oliveira.hexagonal.adapters.in.consumer.message;

import lombok.Data;

@Data
public class CustomerMessage {

    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    private Boolean insValidCpf;

    public CustomerMessage(String id, String name, String zipCode, String cpf, Boolean insValidCpf) {
        this.id = id;
        this.name = name;
        this.zipCode = zipCode;
        this.cpf = cpf;
        this.insValidCpf = insValidCpf;
    }

    public CustomerMessage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getInsValidCpf() {
        return insValidCpf;
    }

    public void setInsValidCpf(Boolean insValidCpf) {
        this.insValidCpf = insValidCpf;
    }
}
