public class Dog extends Animal{

    // Variables
    private static int dogCounter = 0;
    private String dID;
    private Breed dBreed;
    private Breeder dBreeder;
    private Trainer dTrainer;



    public Dog(String name, String colour, String dob, String gender, Breed breed, Breeder breeder, Trainer trainer) {
        super(name, colour, dob, gender);
        this.dID = String.format("%02d", ++dogCounter);
        this.dBreed = breed;
        this.dBreeder = breeder;
        this.dTrainer = trainer;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getColour() {
        return null;
    }

    @Override
    public String getDob() {
        return null;
    }

    @Override
    public String getGender() {
        return null;
    }

    public String getdID() {
        return dID;
    }

    public Breed getdBreed() {
        return dBreed;
    }

    public Breeder getdBreeder() {
        return dBreeder;
    }

    public Trainer getdTrainer() {
        return dTrainer;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public void setColour(String colour) {
    }

    @Override
    public void setDob(String dob) {
    }

    @Override
    public void setGender(String gender) {
    }

    public void setdID(String dID) {
        this.dID = dID;
    }

    public void setdBreed(Breed dBreed) {
        this.dBreed = dBreed;
    }

    public void setdBreeder(Breeder dBreeder) {
        this.dBreeder = dBreeder;
    }

    public void setdTrainer(Trainer dTrainer) {
        this.dTrainer = dTrainer;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dID='" + dID + '\'' +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", dBreed=" + dBreed +
                ", dBreeder=" + dBreeder +
                ", dTrainer=" + dTrainer +
                '}';
    }
}
