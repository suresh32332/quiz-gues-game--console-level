package User;

import java.util.Scanner;

public class LoginSignin {

    private String name;
    private String number;
    private String email;
    private boolean loggedIn = false;

    // LOGIN
    public boolean login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String inputEmail = sc.nextLine();

        System.out.print("Enter your phone: ");
        String inputNumber = sc.nextLine();

        if (email != null && email.equals(inputEmail) && number.equals(inputNumber)) {
            System.out.println("Login Successful!");
            loggedIn = true;
        } else {
            System.out.println("Login Failed!");
        }
        return loggedIn;
    }

    // SIGNUP 
    public void signup() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your phone: ");
        number = sc.nextLine();

        System.out.print("Enter your email: ");
        email = sc.nextLine();

        System.out.println("Signup Successful!");
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
