package com.lifebug.facevision.repository;

import com.lifebug.facevision.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Integer> {
}
