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
            System.out.println();
        }
        else{
            System.out.println("Wrong username or password");
        }

        // Adding new Breeds
        Breed husky = new Breed("Husky");
        Breed labrador = new Breed("Labrador");
        System.out.println(husky.toString());
        System.out.println(labrador.toString());
        System.out.println();


        // Add new Breeders
        Breeder breeder1 = new Breeder("John","Doe", "01/02/1955", "123 Dog Street", "01231 2121","Judge");
        Breeder breeder2 = new Breeder("Jane", "Doe", "02/04/1991","324 Avenue", "0131 556 3422","Groomer");
        System.out.println(breeder1.toString());
        System.out.println(breeder2.toString());
        System.out.println();

    }
    private static boolean checkUserCredentials(String username,String password, Admin admin){
        return(admin.getUsername().equals(username)) && (admin.getPassword().equals(password));
    }
}