package com.strzelecki.loancalculator.service;

import com.strzelecki.loancalculator.domain.LoanCalculatorForm;
import org.springframework.stereotype.Service;

@Service
public class LoanCalculatorService {

    public double calculateMonthlyPayment(LoanCalculatorForm form) {
        return form.getAmount() * (1 + (form.getInterest() * 0.01)) / form.getTerm();
    }
}
