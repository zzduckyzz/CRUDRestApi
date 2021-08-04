package com.duc.springboot.repo;

import com.duc.springboot.entity.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity, Integer> {
}
