package com.pogorelov.swaggersample.service;

import com.pogorelov.swaggersample.domain.pg.Company;
import com.pogorelov.swaggersample.repository.pg.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.pogorelov.swaggersample.config.PgDatabaseConfiguration.PG_TRANSACTION_MANAGER;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Transactional(value = PG_TRANSACTION_MANAGER, readOnly = true)
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}

