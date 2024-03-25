public class Breed {
    public static int breedCounter = 0;
    private final String bID;
    private String breedName;

    // Constructor
    public Breed(String breedName){
        this.bID = String.format("%02d",++breedCounter);
        this.breedName = breedName;
    }

    // Getter
    public String getBreedName() {
        return breedName;
    }

    // Setter
    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "bID='" + bID + '\'' +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}
