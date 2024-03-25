public class Breeder extends Person {

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

    public String getbRole() {
        return bRole;
    }

    public int getbScore() {
        return bScore;
    }

    public double getbScoreD() {
        return bScoreD;
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

    public void setbRole(String bRole) {
        this.bRole = bRole;
    }

    public void setbScore(int bScore) {
        this.bScore = bScore;
    }

    public void setbScoreD(double bScoreD) {
        this.bScoreD = bScoreD;
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
