package com.zyq.streamwise.repository;

import com.zyq.streamwise.entity.RealTimeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealTimeDataRepository extends JpaRepository<RealTimeData, Long> {
}
