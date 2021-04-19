package com.machine.atm;
import java.util.Scanner;

public class BankingTransaction {
    Scanner input = new Scanner(System.in);

    MainProgram mainProgram = new MainProgram();
    double accountBalance = mainProgram.accountBalance;

    public void depositFunds(){
        Menu menu = new Menu();

        System.out.print("\nChecking Account Balance: $"+ accountBalance +"\n" +
                "Amount you want to deposit\nfrom Checking Account: ");
        int depositAmount = input.nextInt();

        System.out.print("New Checking Account Balance: $"+ (accountBalance + depositAmount) +"\n");

        menu.mainMenu();
    }
}