package com.strzelecki.loancalculator.domain;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
public class LoanCalculatorForm {

    @NotNull
    @Min(1)
    private Double amount;

    @NotNull
    @Min(1)
    private Integer term;

    @NotNull
    @Min(1)
    private Double interest;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
}
