package com.machine.atm;
import java.util.Scanner;

public class AccountTypes {
    Scanner input = new Scanner(System.in);
    AtmTransaction atmTransaction = new AtmTransaction();
    MainProgram mainProgram = new MainProgram();

    public void accountType(int type) {
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

        System.out.print("\n"+ Type +" Account:\n" +
                "Type 1 - View Balance\n" +
                "Type 2 - Withdraw Funds\n" +
                "Type 3 - Deposit Funds\n" +
                "Type 4 - Exit\n" +
                "Choice: ");
        byte typeStep = input.nextByte();

        switch (typeStep) {
            case 1:
                System.out.print("\n"+ Type +" Account Balance: $"+ accountBalance +"\n");
                menu.mainMenu();
                break;
            case 2:
                atmTransaction.withdrawFunds(type);
                break;
            case 3:
                atmTransaction.depositFunds(type);
                break;
            case 4:
                System.out.println("\nThank You for using this ATM, bye.");
                System.exit(0);
                break;
        }
    }
}