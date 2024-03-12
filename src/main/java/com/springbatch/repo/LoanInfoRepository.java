package com.springbatch.repo;

import com.springbatch.entity.LoanInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanInfoRepository extends JpaRepository<LoanInfo, Long> {
    // You can add custom query methods here if needed
}