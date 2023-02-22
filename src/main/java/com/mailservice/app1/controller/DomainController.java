package com.mailservice.app1.controller;

import com.mailservice.app1.requests.DomainRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
//@RequestMapping("/domains")
public class DomainController {
    @GetMapping("/domain")
    public String getDomains(){
        return "merhaba";
    }
    @PostMapping("/domain")
    public ResponseEntity<String> createDomain(@RequestBody DomainRequest dR){
        return new ResponseEntity<>(dR.getName(), HttpStatus.OK);
    }

}
