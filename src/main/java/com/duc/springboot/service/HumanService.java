package com.duc.springboot.service;

import com.duc.springboot.entity.HumanEntity;

import java.util.List;
import java.util.Optional;

public interface HumanService {
    List<HumanEntity> getAllHuman();
    Optional<HumanEntity> findById(Integer id);
    HumanEntity save(HumanEntity human);
    public void deleteById(Integer id);
}
