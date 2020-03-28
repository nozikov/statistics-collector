package com.axamit.sc.crud.source.site.controller;

import com.axamit.sc.crud.source.site.service.SiteStatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SiteStatisticsController {

  private final SiteStatisticsService siteService;

}
