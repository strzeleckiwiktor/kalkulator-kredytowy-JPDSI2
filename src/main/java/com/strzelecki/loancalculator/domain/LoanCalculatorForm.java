package com.strzelecki.loancalculator.domain;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
public class LoanCalculatorForm {

    @NotNull(message = "Kwota nie może być pusta")
    @Min(value = 1000, message = "Kwota pożyczki musi wynosić co najmniej 1000 ")
    @Max(value = 1000000, message = "Kwota pożyczki nie może przekraczać 1000000")
    private Double amount;

    @NotNull(message = "Okres nie może być pusty")
    @Min(value = 1, message = "Okres pożyczki musi wynosić co najmniej miesiąc")
    @Max(value = 120, message = "Okres pożyczki nie może przekraczać 10 lat")
    private Integer term;

    @NotNull(message = "Oprocentowanie nie może być puste")
    @Min(value = 1, message = "Oprocentowanie pożyczki musi wynosić co najmnniej 1")
    @Max(value = 100, message = "Oprocentowanie pożyczki nie może przekraczać 100")
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
