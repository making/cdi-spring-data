package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.enterprise.context.Dependent;

@Dependent
public interface PointRepository extends JpaRepository<Point, Integer> {
}
