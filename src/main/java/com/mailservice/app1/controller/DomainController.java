package com.mailservice.app1.controller;

import com.mailservice.app1.model.Domain;
import com.mailservice.app1.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
//@RequestMapping("/domains")
public class DomainController {

    @Autowired
    DomainRepository domainRepository;

    @GetMapping("/getAll")
    public List<Domain> getAllDomain() {
        return domainRepository.findAll();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Domain> getDomainById(@PathVariable("id") Long id) {
        Domain domain = findById(id);

        if (domain == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(domain, HttpStatus.OK);
        }
    }

    public Domain findById(Long id) {
        List<Domain> domainData = domainRepository.findAll();

        for (Domain domain : domainData) {
            if (Objects.equals(domain.getDomainID(), id)) {
                return domain;
            }
        }
        return null;
    }
}



