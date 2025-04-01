package com.zyq.streamwise.consumer;

import com.zyq.streamwise.entity.RealTimeData;
import com.zyq.streamwise.repository.RealTimeDataRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final RealTimeDataRepository repository;

    public KafkaConsumerService(RealTimeDataRepository repository) {
        this.repository = repository;
    }
    @KafkaListener(topics = "real_time_data", groupId = "streamwise-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);

        RealTimeData entity = new RealTimeData();
        entity.setContent(message);
        repository.save(entity);
    }
}
