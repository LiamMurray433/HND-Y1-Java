public class Competitor {

    // Variables
    public static int competitorCounter = 0;
    private String compID;
    private String categoryName;
    private String judgeName;
    public String dogName;
    private String dogScore;

    public Competitor(Category category, Breeder breeder, Dog dog, String dogScore) {
        this.compID = String.format("%02d", ++competitorCounter);
        this.categoryName = category.getcName();
        this.judgeName = breeder.getName();
        this.dogName = dog.name;
        this.dogScore = dogScore;
    }

    public String getCompID() {
        return compID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getJudgeName() {
        return judgeName;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogScore() {
        return dogScore;
    }

    public void setCompID(String compID) {
        this.compID = compID;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setJudgeName(String judgeName) {
        this.judgeName = judgeName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogScore(String dogScore) {
        this.dogScore = dogScore;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "compID='" + compID + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", judgeName='" + judgeName + '\'' +
                ", dogName='" + dogName + '\'' +
                ", dogScore='" + dogScore + '\'' +
                '}';
    }
}
