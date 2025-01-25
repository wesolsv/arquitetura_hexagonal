package com.oliveira.hexagonal.adapters.in.consumer;

import com.oliveira.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.oliveira.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.oliveira.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatorCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "oliveira")
    public void receive(CustomerMessage customerMessage) {
        System.out.println("teste");
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
