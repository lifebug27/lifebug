package com.lifebug.facevision.service;

import com.lifebug.facevision.model.Attendance;
import com.lifebug.facevision.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository repository;

    public List<Attendance> getAllAttendance() {
        return (List<Attendance>) repository.findAll();
    }

    public Attendance getAttendance(Integer id) {
        Optional<Attendance> attendance = repository.findById(id);
        return attendance.get();
    }

    public void deleteAttendance(Integer id) {
        repository.deleteById(id);
    }

//    public ResponseEntity<Object> createProfile(Attendance attendance) {
//        Attendance savedAttendance = repository.save(attendance);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(savedAttendance.getId()).toUri();
//
//        return ResponseEntity.created(location).build();
//    }

//    public ResponseEntity<Object> updateAttendance(Attendance attendance, Integer id) {
//        Optional<Attendance> attendanceOptional = repository.findById(id);
//        if (!attendanceOptional.isPresent())
//            return ResponseEntity.notFound().build();
//        attendance.setId(id);
//        repository.save(attendance);
//        return ResponseEntity.noContent().build();
//    }
}
