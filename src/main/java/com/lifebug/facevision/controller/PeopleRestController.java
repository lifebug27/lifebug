package com.lifebug.facevision.controller;

import com.lifebug.facevision.model.People;
import com.lifebug.facevision.service.PeopleService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PeopleRestController {
    @Autowired
    private PeopleService service;

    @ApiOperation("Returns all people")
    @GetMapping
    public List<People> getAllProfile() {
        return service.getAllProfile();
    }

    @ApiOperation("Returns people by id")
    @GetMapping("/{id}")
    public People getProfile(@ApiParam(value = "User's uuid", required = true) @PathVariable Integer id) {
        return service.getProfile(id);
    }

    @ApiOperation("Deletes people by id")
    @DeleteMapping("/{id}")
    public void deleteProfile(@ApiParam(value = "User's uuid", required = true) @PathVariable Integer id) {
        service.deleteProfile(id);
    }

    @ApiOperation("Adds new people")
    @PostMapping
    public ResponseEntity<Object> createProfile(@ApiParam(value = "User's profile", required = true) @RequestBody People people) {
        return service.createProfile(people);
    }

    @ApiOperation("Updates people profile by id")
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProfile(@ApiParam(value = "User's profile", required = true) @RequestBody People people,
                                                @ApiParam(value = "User's uuid", required = true) @PathVariable Integer id) {
        return service.updateProfile(people, id);
    }
}
