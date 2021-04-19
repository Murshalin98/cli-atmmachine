package com.machine.atm;
import java.util.Scanner;

public class AccountTypes {
    Scanner input = new Scanner(System.in);
    BankingTransaction bankingTransaction = new BankingTransaction();

    MainProgram mainProgram = new MainProgram();
    double accountBalance = mainProgram.accountBalance;

    public void checkingAccount(){
        Menu menu = new Menu();

        System.out.print("\nChecking Account:\n\n" +
                "Type 1 - View Balance\n" +
                "Type 2 - Withdraw Funds\n" +
                "Type 3 - Deposit Funds\n" +
                "Type 4 - Exit\n\n" +
                "Choice: ");
        byte checkingStep = input.nextByte();

        switch (checkingStep) {
            case 1:
                System.out.print("\nChecking Account Balance: $"+ accountBalance +"\n");
                menu.mainMenu();
                break;
            case 3:
                bankingTransaction.depositFunds();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}