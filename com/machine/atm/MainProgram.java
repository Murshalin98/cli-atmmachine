package com.machine.atm;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainProgram {
    double checkingAccountBalance = 1000;
    double savingAccountBalance = 1500;

    public static void main(String[] args) {
        long accountNumber = 8989898;
        short accountPin = 1890;

        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        try {
            System.out.print("Welcome to the ATM Project!\nEnter Your Customer Number: ");
            long typedAccountNumber = input.nextLong();
            System.out.print("Enter Your Pin Number: ");
            short typedAccountPin = input.nextShort();

            if (typedAccountNumber==accountNumber && typedAccountPin==accountPin) {
                menu.mainMenu();
            }
            else {
                System.out.println("\nWrong Customer Number or Pin Number.\n");
                main(args);
            }
        } catch (InputMismatchException ex) {
            System.out.println("\nEnter Input Correctly Following Directions.\n");
        }
    }
}