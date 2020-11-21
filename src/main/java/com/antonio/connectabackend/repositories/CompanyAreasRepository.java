package com.antonio.connectabackend.repositories;

import com.antonio.connectabackend.models.CompanyAreas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyAreasRepository extends JpaRepository<CompanyAreas, UUID> {
}
