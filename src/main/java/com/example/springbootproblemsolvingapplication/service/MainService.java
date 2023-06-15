package com.example.springbootproblemsolvingapplication.service;

import com.example.springbootproblemsolvingapplication.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    private SignUpRepository signUpRepository;
}
