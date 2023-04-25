package com.example.ab.service;

import com.example.ab.GeneratedServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String, GeneratedServiceDTO> kafkaTemplate;

    public void send(GeneratedServiceDTO generatedServiceDTO){
        kafkaTemplate.send("generatedService", generatedServiceDTO);
    }
}