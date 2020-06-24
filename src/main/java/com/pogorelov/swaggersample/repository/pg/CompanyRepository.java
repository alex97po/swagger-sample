package com.pogorelov.swaggersample.repository.pg;

import com.pogorelov.swaggersample.domain.pg.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
