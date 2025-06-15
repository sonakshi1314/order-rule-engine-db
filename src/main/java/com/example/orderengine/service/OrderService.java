package com.example.orderengine.service;

import com.example.orderengine.engine.RuleEngine;
import com.example.orderengine.model.Order;
import com.example.orderengine.model.Rule;
import com.example.orderengine.repository.RuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final RuleRepository ruleRepo;
    private final RuleEngine engine;

    public OrderService(RuleRepository ruleRepo, RuleEngine engine) {
        this.ruleRepo = ruleRepo;
        this.engine = engine;
    }

    public String processOrder(Order order) {
        List<Rule> rules = ruleRepo.findAll();
        return engine.evaluate(order, rules).orElse("NO_PARTNER");
    }
}
