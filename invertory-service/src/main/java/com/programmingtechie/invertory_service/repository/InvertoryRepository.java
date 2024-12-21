package com.programmingtechie.invertory_service.repository;

import com.programmingtechie.invertory_service.model.Invertory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvertoryRepository extends JpaRepository<Invertory,Long> {

}
