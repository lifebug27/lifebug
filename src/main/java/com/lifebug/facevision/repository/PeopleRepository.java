package com.lifebug.facevision.repository;

import com.lifebug.facevision.model.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Integer> {
}
