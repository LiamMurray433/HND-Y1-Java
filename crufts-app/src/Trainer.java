public class Trainer extends Person {

    private static int trainerCounter = 0;

    private String tID;
    private String tAddress;
    private String tPhone;

    public Trainer(String name, String surname, String dob, String address, String phone) {
        super(name, surname, dob);
        this.tID = String.format("%02d", ++trainerCounter);
        this.tAddress = address;
        this.tPhone = phone;
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

    public String gettID() {
        return tID;
    }

    public String gettAddress() {
        return tAddress;
    }

    public String gettPhone() {
        return tPhone;
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

    public void settID(String tID) {
        this.tID = tID;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "tID='" + tID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob='" + dob + '\'' +
                ", tAddress='" + tAddress + '\'' +
                ", tPhone='" + tPhone + '\'' +
                '}';
    }
}
