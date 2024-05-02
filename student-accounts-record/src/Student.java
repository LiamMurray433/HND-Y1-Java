import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    private static int studentCounter = 0;
    private String studentID;
    private String firstName;
    private String surname;
    private String username;
    private String password;

    String csvFile;


    // Constructor
    public Student(String firstName, String surname, String username, String password, String csvFile) {
        this.studentID = String.format("%02d", studentCounter++);
        this.firstName = firstName;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.csvFile = csvFile;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getcsvFile(){
        return csvFile;
    }

    // Setters

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String course) {
        this.username = course;
    }

    public void setCsvFile(String csvFile){
        this.csvFile = csvFile;
    }

    public boolean authenticate(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String enteredUsername =scanner.nextLine();

        System.out.println("Enter password: ");
        String enteredPassword =scanner.nextLine();

        //Object enteredPassword = null;
        //Object enteredUsername = null;
        return this.username.equals(enteredUsername)&&this.password.equals(enteredPassword);


    }

}
