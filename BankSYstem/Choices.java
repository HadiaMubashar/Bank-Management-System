package BankSYstem;

import java.util.Scanner;

public class Choices {
    public static boolean hasEmail = false;
    public static boolean haslength = false;
    public static boolean hasUpper = false;
    public static boolean hasLower = false;
    public static boolean hasDigit = false;
    public static char c ;

    Scanner scanner = new Scanner(System.in);
    String[] emails = new String[20];
    String[] passwords = new String[20];
    int [] id = new int[20];
    int counter;
    double[] balance = new double[20];


    public void createAccount(){
        System.out.println("Enter email");
        emails[counter] = scanner.next();
        System.out.println("Enter password");
        passwords[counter] = scanner.next();
//        validateEmail(String.valueOf(emails));
//        validatePassword(String.valueOf(passwords));
        id[counter] = counter;
        counter++;
    }

    public void deposit(){
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();

        for (int i = 0; i < counter; i++){
            if (email.equals(emails[i]) && password.equals(passwords[i])){
                System.out.println("Enter amount for deposit: ");
                double deposit_amount = scanner.nextDouble();
                balance[i] += deposit_amount;
                System.out.println("Deposited "+ deposit_amount + " to " + email + " Account. ");
            }
            else {
                System.out.println("User not found!  \n .... Try to create an account .... or .... Try Again");
            }
        }
    }

    public void withDraw(){
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();

        for (int i = 0; i < counter; i++){
            if (email.equals(emails[i]) && password.equals(passwords[i])){
                System.out.println("Enter amount for WithDraw: ");
                double with_draw = scanner.nextDouble();
                if (balance[i] - with_draw >= 0){
                    balance[i] -= with_draw;
                    System.out.println("WithDraw "+ with_draw + " from " + email + " Account. ");
                }
            }
            else {
                System.out.println("User not found!  \n .... Try to create an account .... or .... Try Again");
            }
        }
    }

    public void checkBalance(){
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();

        for (int i = 0; i < counter; i++){
            if (email.equals(emails[i]) && password.equals(passwords[i])){
                System.out.println(email + " : Total balance is " + balance[i]);
            }
            else {
                System.out.println("User not found!  \n .... Try to create an account .... or .... Try Again");
            }
        }
    }

    public void validateEmail(String email) {
        if (email.charAt(0) != '@' && email.contains("@") && email.endsWith(".com")){
            hasEmail = true;
        }
        else{
            System.out.println("Email is not correct");
        }
    }

    public void validatePassword(String password) {
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);

            if (password.length() > 8) {
                haslength = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }

        }
        if (haslength && hasUpper && hasLower && hasDigit) {
            System.out.println("Strong Password");
        }
        else {
            System.out.println("Password must contain at least 8 character \n Password must contain at least 1 or lower case Upper case Character \n Password must contain at least 1 Digit");
        }
    }

}
