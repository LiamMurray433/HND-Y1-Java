import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {

        students.add(new Student("Liam", "Murray", "lm", "123", "C:\\Programming\\Java-Projects\\student-accounts-record\\src\\PurchaseHistory.csv"));
        students.add(new Student("Melvin", "Sebastiao", "ms","999","C:\\Programming\\Java-Projects\\student-accounts-record\\src\\melvin.csv"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, Please log in");

        // Prompt for login credentials
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Find the student with matching credentials
        Student loggedInStudent = null;
        for (Student student : students) {
            if (student.authenticate(username, password)) {
                loggedInStudent = student;
                break;
            }
        }

        // Check if a student was found with matching credentials
        if (loggedInStudent != null) {
            // Access the details of the logged-in student
            System.out.println("Logged in as: " + loggedInStudent.getFirstName() + " " + loggedInStudent.getSurname());
        } else {
            System.out.println("Incorrect username or password");
        }

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
                    menu.option1(loggedInStudent);
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