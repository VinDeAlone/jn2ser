package com.jn2ser.demoService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jn2ser.demoService.entities.Demo;

public interface DemoRepository extends JpaRepository<Demo, Integer> {

}
