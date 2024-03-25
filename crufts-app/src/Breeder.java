public class Breeder extends Person implements iLadder, IRole {

    public static int breederCounter = 0;
    private String bID;
    private String bAddress;
    private String bPhone;
    private String bRole;
    private int bScore;
    private double bScoreD;

    public Breeder(String name, String surname, String dob, String address,String phone, String role) {
        super(name, surname, dob);
        this.bID = String.format("%02d", ++breederCounter);
        this.bAddress = address;
        this.bPhone = phone;
        this.bRole = role;
        this.bScore = 0;
        this.bScoreD = 0.0;
    }


    // Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getDob() {
        return dob;
    }

    public String getbID() {
        return bID;
    }

    public String getbAddress() {
        return bAddress;
    }

    public String getbPhone() {
        return bPhone;
    }


    // Setters
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setbID(String bID) {
        this.bID = bID;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public void setbPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public String getRole() {
        return bRole;
    }

    @Override
    public void setRole(String role) {
        this.bRole = role;
    }
    @Override
    public int addPoints(int points) {
        return this.bScore = points;
    }

    @Override
    public double addPoints(double points) {
        return this.bScoreD = points;
    }

    @Override
    public int deletePoints(int points) {
        return bScore = points;
    }

    @Override
    public double deletePoints(double points) {
        return bScoreD = points;
    }


    @Override
    public String toString() {
        return "Breeder{" +
                "bID='" + bID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob='" + dob + '\'' +
                ", bAddress='" + bAddress + '\'' +
                ", bPhone='" + bPhone + '\'' +
                ", bRole='" + bRole + '\'' +
                '}';
    }




}
