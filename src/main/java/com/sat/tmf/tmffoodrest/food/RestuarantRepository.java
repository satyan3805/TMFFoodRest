package com.sat.tmf.tmffoodrest.food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import jakarta.persistence.EntityManager;

public interface RestuarantRepository extends JpaRepository<Restuarant, Long>{



}
