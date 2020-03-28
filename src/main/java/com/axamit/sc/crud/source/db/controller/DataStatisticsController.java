package com.axamit.sc.crud.source.db.controller;

import com.axamit.sc.crud.source.db.service.DataStatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DataStatisticsController {

  private final DataStatisticsService dataService;

}
