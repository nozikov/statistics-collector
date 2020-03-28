package com.axamit.sc.crud.source.db.service;

import com.axamit.sc.crud.source.db.DataStatisticsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataStatisticsService {

  private final DataStatisticsRepository dataRepository;

}
