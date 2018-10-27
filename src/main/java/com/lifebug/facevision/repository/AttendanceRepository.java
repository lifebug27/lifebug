package com.lifebug.facevision.repository;

import com.lifebug.facevision.model.Attendance;
import org.springframework.data.repository.CrudRepository;

public interface AttendanceRepository extends CrudRepository<Attendance, Integer> {
}
