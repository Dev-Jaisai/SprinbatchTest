package com.springbatch.config;

import com.springbatch.entity.LoanInfo;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<LoanInfo, LoanInfo> {

    @Override
    public LoanInfo process(LoanInfo loanInfo) throws Exception {
        return null;
    }
}
