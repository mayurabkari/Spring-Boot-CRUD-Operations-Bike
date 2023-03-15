package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {

}
