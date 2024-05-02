import java.util.Scanner;

public class login {

    // variable
    //private static int LogCounter =1;
    //private String sID;
    private String username ;
    private String password ;

    // constructor
    public login(String username, String password) {
        //this.sID = String.format("%01d",LogCounter++ );
        this.username = username;
        this.password = password;
    }

    //getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    // setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticate(){

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter username: ");
        String enteredUsername =scanner.nextLine();

        System.out.println("Enter password: ");
        String enteredPassword =scanner.nextLine();

        //Object enteredPassword = null;
        //Object enteredUsername = null;
        return this.username.equals(enteredUsername)&&this.password.equals(enteredPassword);


    }

}
