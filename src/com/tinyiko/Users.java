package com.tinyiko;

public class Users {

    static final BankAccount ACCOUNT = new BankAccount(50);

    public static void main(String[] args) {
        ACCOUNT.topUp(100);

        Thread accountHolder1 = new Thread(() -> {
            FNBAtm.withdraw(ACCOUNT, 100);
        });

        Thread accountHolder2 = new Thread(() -> {
            FNBAtm.withdraw(ACCOUNT, 100);
        });

        accountHolder1.start();
        accountHolder2.start();

    }
}
