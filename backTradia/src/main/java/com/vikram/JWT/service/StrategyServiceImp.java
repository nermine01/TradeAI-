package com.vikram.JWT.service;

import com.vikram.JWT.repository.StrategyRepository;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.script.ScriptTemplateConfig;
@Service
public class StrategyServiceImp implements StrategyService {
    @Autowired
    StrategyRepository strategyRepository;

}
