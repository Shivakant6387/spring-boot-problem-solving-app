package com.example.springbootproblemsolvingapplication.repository;

import com.example.springbootproblemsolvingapplication.model.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,Integer> {
}
