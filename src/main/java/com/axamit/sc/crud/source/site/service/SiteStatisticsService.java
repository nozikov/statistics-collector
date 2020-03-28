package com.axamit.sc.crud.source.site.service;

import com.axamit.sc.crud.source.site.repository.SiteStatisticsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SiteStatisticsService {

  private final SiteStatisticsRepository siteRepository;

}
