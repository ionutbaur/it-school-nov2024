package com.itschool.session15.course;

public class Pos {

    private final BankingService bankingService;

    public Pos(BankingService bankingService) {
        this.bankingService = bankingService;
    }

    public void transaction() {
        bankingService.pay();
        System.out.println("Transaction successful!");
    }
}
