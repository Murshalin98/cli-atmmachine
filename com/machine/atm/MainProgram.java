package com.machine.atm;
import java.util.Scanner;

public class MainProgram {
    double accountBalance = 1000;

    public static void main(String[] args) {
        long accountNumber = 8989898;
        short accountPin = 1890;

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.print("Welcome to the ATM Project!\n\nEnter Your Customer Number: ");
        long typedAccountNumber = input.nextLong();
        System.out.print("Enter Your Pin Number: ");
        short typedAccountPin = input.nextShort();

        if (typedAccountNumber==accountNumber && typedAccountPin==accountPin) {
            menu.mainMenu();
        }
        else {
            System.out.println("\nAccount or Pin is Wrong!");
        }
    }
}