import java.util.Scanner;

public class Main {

    private String username;
    private String password;
    private String confirm_password;

    protected void register() {
        try (Scanner sc = new Scanner(System.in)) {
            boolean CheckConfirmPassword = true;

            System.out.print("\tEnter Username => ");
            username = sc.nextLine();

            while (CheckConfirmPassword) {
                System.out.print("\tEnter Password => ");
                password = sc.nextLine();

                System.out.print("\tEnter Confirm Password => ");
                confirm_password = sc.nextLine();

                if (password.equals(confirm_password)) {
                    CheckConfirmPassword = false;
                } else {
                    System.out.println("\n\t!!! ERROR !!! Password Isn't Match !!!\n");
                }
            }
            login(this.username, this.password);
        }
        
        username = username.trim();
        password = password.trim();
        confirm_password = confirm_password.trim();
    }

    protected void login(String username, String password) {

        // System.out.println("\nI am in Login Function");
        // System.out.println(username);
        // System.out.println(password);

        String InputUsername;
        String InputPassword;
        boolean IsLogout = true;

        try (Scanner sc = new Scanner(System.in)) {
            while (IsLogout) {
                System.out.print("\tEnter Username => ");
                InputUsername = sc.nextLine();

                if (InputUsername.equals(username)) {
                    System.out.print("\tEnter Password => ");
                    InputPassword = sc.nextLine();
                    if (InputPassword.equals(password)) {
                        System.out.println("\n\t!!! SUCCESS !!! Login SuccessFull !!!\n");
                        IsLogout = false;
                    } else {
                        System.out.println("\n\t!!! ERROR !!! Wrong Password !!!\n");
                    }
                } else {
                    System.out.println("\n\t!!! ERROR !!! Wrong Username !!!\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.register();
        }
}