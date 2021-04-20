package com.machine.atm;
import java.util.Scanner;

public class BankingTransaction
{
    Scanner input = new Scanner(System.in);
    MainProgram mainProgram = new MainProgram();

    public void depositFunds(int type)
    {
        Menu menu = new Menu();
        String Type = null;
        String action = null;
        double accountBalance = 0;

        if (type == 1) {
            Type = "Checking";
            accountBalance = mainProgram.checkingAccountBalance;
        }
        else if (type == 2) {
            Type = "Saving";
            accountBalance = mainProgram.savingAccountBalance;
        }

        System.out.print("\n"+ Type + " Account Balance: $" + accountBalance + "\n" +
                "Amount you want to deposit from "+ Type +" Account: ");
        int depositAmount = input.nextInt();
        System.out.print("New "+ Type +" Account Balance: $" + (accountBalance + depositAmount) + "\n");

        menu.mainMenu();
    }

    public void withdrawFunds(int type)
    {
        Menu menu = new Menu();
        String Type = null;
        double accountBalance = 0;

        if (type == 1) {
            Type = "Checking";
            accountBalance = mainProgram.checkingAccountBalance;
        }
        else if (type == 2) {
            Type = "Saving";
            accountBalance = mainProgram.savingAccountBalance;
        }

        System.out.print("\n"+ Type + " Account Balance: $"+ accountBalance +"\n" +
                "Amount you want to withdraw from "+ Type +" Account: ");
        int withdrawAmount = input.nextInt();
        System.out.print("New "+ Type +" Account Balance: $"+ (accountBalance - withdrawAmount) +"\n");

        menu.mainMenu();
    }
}