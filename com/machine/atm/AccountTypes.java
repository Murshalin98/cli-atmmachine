package com.machine.atm;
import java.util.Scanner;

public class AccountTypes
{
    Scanner input = new Scanner(System.in);
    BankingTransaction bankingTransaction = new BankingTransaction();
    MainProgram mainProgram = new MainProgram();

    public void accountType(int type)
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

        System.out.print("\n"+ Type +" Account:\n" +
                "Type 1 - View Balance\n" +
                "Type 2 - Withdraw Funds\n" +
                "Type 3 - Deposit Funds\n" +
                "Type 4 - Exit\n" +
                "Choice: ");
        byte typeStep = input.nextByte();

        switch (typeStep)
        {
            case 1:
                System.out.print("\n"+ Type +" Account Balance: $"+ accountBalance +"\n");
                menu.mainMenu();
                break;
            case 2:
                bankingTransaction.withdrawFunds(type);
                break;
            case 3:
                bankingTransaction.depositFunds(type);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}