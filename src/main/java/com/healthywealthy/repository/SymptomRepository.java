package com.healthywealthy.repository;

import com.healthywealthy.model.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SymptomRepository extends JpaRepository<Symptom, Integer> {
    List<Symptom> findByBodyPartId(int bodyPartId);
}
