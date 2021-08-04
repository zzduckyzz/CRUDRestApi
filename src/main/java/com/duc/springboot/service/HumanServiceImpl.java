package com.duc.springboot.service;

import com.duc.springboot.entity.HumanEntity;
import com.duc.springboot.repo.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HumanServiceImpl implements HumanService {

    @Autowired
    HumanRepository humanRepository;

    @Override
    public List<HumanEntity> getAllHuman() {
        List<HumanEntity> human = humanRepository.findAll();
        return human;
    }

    @Override
    public Optional<HumanEntity> findById(Integer id) {
        return humanRepository.findById(id);
    }

    @Override
    public HumanEntity save(HumanEntity human) {
        return humanRepository.save(human);
    }

    @Override
    public void deleteById(Integer id) {
        humanRepository.deleteById(id);
    }
}