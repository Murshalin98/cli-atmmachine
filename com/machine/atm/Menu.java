package com.machine.atm;
import java.util.Scanner;

public class Menu
{
    Scanner input = new Scanner(System.in);
    AccountTypes accountTypes = new AccountTypes();

    public void mainMenu()
    {
        System.out.print("\nSelect the Account you want to access:\n" +
                "Type 1 - Checking Account\n" +
                "Type 2 - Saving Account\n" +
                "Type 3 - Exit\n" +
                "Choice: ");
        byte mainStep = input.nextByte();

        if (mainStep==1)
        {
            accountTypes.accountType(1);
        }
        else if (mainStep==2) {
            accountTypes.accountType(2);
        }
        else if (mainStep==3)
        {
            System.out.println("\nThank You for using this ATM, bye.");
            System.exit(0);
        }
    }
}