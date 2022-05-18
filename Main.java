import java.util.Scanner;

/**
 * Main
 */
public class Main {

    private String username;
    private String password;
    private String confirm_password;
    public boolean IsLogout = true;

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

            int choice;
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("\n\tEnter Your Choice => ");
                choice = input.nextInt();
                System.out.print("\n");

                switch (choice) {
                    case 1:
                        login(this.username, this.password);
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\t!!! ERROR !!! Wrong Choice !!!\n");
                        break;
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }

        username = username.trim();
        password = password.trim();
        confirm_password = confirm_password.trim();
    }

    protected void login(String username, String password) {

        String InputUsername;
        String InputPassword;

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
        Module_1 m1 = new Module_1();
        Module_2 m2 = new Module_2();
        Main mn = new Main();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\t Enter Your Choice => ");
            int choice = sc.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.print("\t Enter Student's First Name => ");
                    m1.fname = sc.next();
                    System.out.print("\t Enter Student's Last Name => ");
                    m1.lname = sc.next();
                    System.out.print("\t Enter University ID => ");
                    m1.university_id = sc.next();
                    System.out.print("\t Enter Username => ");
                    m1.user_id = sc.next();
                    System.out.print("\t Enter Semester => ");
                    m1.semester = sc.nextInt();
                    System.out.print("\n");


                    m1.getData(m1.fname, m1.lname, m1.university_id, m1.user_id, m1.semester);
                    m1.SetData();

                    break;
                
                case 2:
                    m2.IT_Department();
                    m2.Computer_Department();
                    m2.Mechanical_Department();
                    m2.Electronic_Department();
                    m2.Civil_Department();

                    break;

                default:
                    System.out.println("!!! ERROR !!! Wrong Choice !!!");
                    break;
            }
        }
    }
}