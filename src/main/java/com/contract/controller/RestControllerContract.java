package com.contract.controller;


import com.contract.model.Contract;
import com.contract.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllerContract {

    @Autowired
    private ContractRepository contractRepository;

    @GetMapping("/users")
    List<Contract> getAllUsers(){
        List<String> list = new ArrayList<>();
        List<Contract> contracts = contractRepository.findAll();
        list.add("one");
        return contracts;//userService.find;
    }
}
