package com.zyq.streamwise.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "real_time_data")
@Data
public class RealTimeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    private LocalDateTime receiveAt = LocalDateTime.now();
}
