package BankSYstem;

import java.util.Scanner;

public class Edit extends Choices {
    public static void main(String[] args) {
        Edit edit = new Edit();
        int exit = 0;
        while (exit != 1){
            System.out.println(" 1) Create Account");
            System.out.println(" 2) Deposit");
            System.out.println(" 3) Withdraw");
            System.out.println(" 4) Check_balance");
            System.out.println(" 5) Exit");
            System.out.println("Enter your choice");
            int choice;
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                  edit.createAccount();
                  break;
                case 2:
                    edit.deposit();
                   break;
                case 3:
                    edit.withDraw();
                   break;
                case 4:
                    edit.checkBalance();
                   break;
                case 5:
                    exit = 1;
                   break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
