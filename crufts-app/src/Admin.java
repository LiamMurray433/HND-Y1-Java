public class Admin {

    private static int adminCounter = 0;
    private String adminID;
    private String username;
    private String password;


    // Constructor
    public Admin(String username, String password){
        this.adminID = String.format("%02d", ++adminCounter);
        this.username = username;
        this.password = password;

    }

    // Getters
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    // Setters
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){

    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
