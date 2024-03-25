public class Main {
    public static void main(String[] args) {

        // Variables
        String username;
        String password;

        // Adding a new admin
        Admin admin = new Admin("Liam", "1111");
        System.out.println(admin.toString());
        username = "Liam";
        password = "1111";
        boolean userExists = checkUserCredentials(username, password, admin);
        // Check
        if(userExists){
            System.out.println("You are logged in");
        }
        else{
            System.out.println("Wrong username or password");
        }

        // Adding new Breed
        Breed husky = new Breed("Husky");
        System.out.println(husky.toString());

    }
    private static boolean checkUserCredentials(String username,String password, Admin admin){
        return(admin.getUsername().equals(username)) && (admin.getPassword().equals(password));
    }
}