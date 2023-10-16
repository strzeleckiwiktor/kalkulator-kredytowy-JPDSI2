package com.strzelecki.loancalculator.controller;

import com.strzelecki.loancalculator.domain.LoanCalculatorForm;
import com.strzelecki.loancalculator.service.LoanCalculatorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoanCalculatorController {
    @Autowired
    private LoanCalculatorService loanCalculatorService;

    @GetMapping("/loan-calculator")
    public String loanCalculatorShow(Model model) {
        model.addAttribute("loanCalculatorForm", new LoanCalculatorForm());
        return "loan-calculator";
    }

    @PostMapping("/loan-calculator")
    public String loanCalculatorSubmit(@Valid @ModelAttribute("loanCalculatorForm") LoanCalculatorForm loanCalculatorForm, BindingResult bindingResult, Model model) {

        if (!bindingResult.hasErrors()) {
            model.addAttribute("result", loanCalculatorService.calculateMonthlyPayment(loanCalculatorForm));
        }

        return "loan-calculator";
    }

}
