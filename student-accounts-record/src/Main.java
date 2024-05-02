import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create Student with login credentials
        //login user = new login("m", "1");
        Student student = new Student("Liam", "Murray", "lm", "123", "C:\\Programming\\Java-Projects\\student-accounts-record\\src\\PurchaseHistory.csv");
        Scanner scanner =new Scanner(System.in);

        // login authentication
        System.out.println("Insert your username and password  ");
        System.out.println("");

        if (student.authenticate())
        {
            System.out.println(" ");
            System.out.println("logged in");
        }
        else
        {
            System.out.println(" ");
            System.out.println("incorrect username or password");
            System.exit(0);
        }


        System.out.println(" ");
        System.out.println("**************************************");
        System.out.println("welcome to your Student account record ");
        System.out.println("**************************************");
        System.out.println(" ");

        MenuOptions menu = new MenuOptions();

        while(true)
        {


            System.out.println("");
            System.out.println("(1) View purchase History, (2) Dashboard, (3) Student account Details and (4) to log out: ");

            int choice = scanner.nextInt();

            // Process user's choice using switch case
            switch (choice)

            {
                case 1:
                    menu.option1();
                    break;
                case 2:
                    menu.option2();
                    break;
                case 3:
                    menu.option3();
                    break;
                case 4:
                    menu.exit();
                    break;
                default:
                    System.out.println("Invalid selection, Please try it again.");
            }


        }
    }
}