package com.axamit.sc.crud.source.db.repository;

import com.axamit.sc.crud.source.db.DataStatisticsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MongoStatisticsRepository implements DataStatisticsRepository {

  private final ReactiveMongoTemplate reactiveMongoTemplate;
}
