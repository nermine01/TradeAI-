package com.vikram.JWT.service;

import com.vikram.JWT.repository.AssetRepository;
import com.vikram.JWT.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioServiceImp implements PortfolioService {
    @Autowired
    PortfolioRepository portfolioRepository;
}
