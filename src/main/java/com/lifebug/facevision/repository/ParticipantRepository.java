package com.lifebug.facevision.repository;

import com.lifebug.facevision.model.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Integer> {
}
