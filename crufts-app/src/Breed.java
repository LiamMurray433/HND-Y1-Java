public class Breed {
    public static int breedCounter = 0;
    private String bID;
    private String name;

    // Constructor
    public Breed(String name){
        this.bID = String.format("%02d",++breedCounter);
        this.name = name;
    }

    // Getter


    public String getbID() {
        return bID;
    }

    public String getNamee() {
        return name;
    }

    // Setter

    public void setbID(String bID){
        this.bID = bID;
    }

    public void setBreedName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "bID='" + bID + '\'' +
                ", breedName='" + name + '\'' +
                '}';
    }
}
