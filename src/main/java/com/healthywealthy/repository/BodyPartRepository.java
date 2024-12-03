package com.healthywealthy.repository;

import com.healthywealthy.model.BodyPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BodyPartRepository extends JpaRepository<BodyPart, Integer> {
    // 필요시 추가적인 쿼리 메서드 작성 가능
}
