package com.lifebug.facevision.service;

import com.lifebug.facevision.model.People;
import com.lifebug.facevision.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository repository;

    public List<People> getAllProfile() {
        return (List<People>) repository.findAll();
    }

    public People getProfile(Integer id) {
        Optional<People> profile = repository.findById(id);
        return profile.get();
    }

    public void deleteProfile(Integer id) {
        repository.deleteById(id);
    }

    public ResponseEntity<Object> createProfile(People profile) {
        People savedProfile = repository.save(profile);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedProfile.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    public ResponseEntity<Object> updateProfile(People profile, Integer id) {
        Optional<People> profileOptional = repository.findById(id);
        if (!profileOptional.isPresent())
            return ResponseEntity.notFound().build();
        profile.setId(id);
        repository.save(profile);
        return ResponseEntity.noContent().build();
    }

}
