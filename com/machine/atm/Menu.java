package com.machine.atm;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    AccountTypes accountTypes = new AccountTypes();

    public void mainMenu() {
        System.out.print("\nSelect the Account you want to access:\n\n" +
                "Type 1 - Checking Account\n" +
                "Type 2 - Saving Account\n" +
                "Type 3 - Exit\n\n" +
                "Choice: ");
        byte mainStep = input.nextByte();

        if (mainStep==1) {
            accountTypes.checkingAccount();
        }
        else if (mainStep==3) {
            System.exit(0);
        }
    }
}