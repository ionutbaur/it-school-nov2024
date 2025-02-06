package com.itschool.session15.course;

public class MainForInterf {

    public static void main(String[] args) {
        Pos pos = new Pos(new MobileBankingServiceImpl());
        pos.transaction();

        Pos pos2 = new Pos(new CreditCardBankingServiceImpl());
        pos2.transaction();
    }
}
