public class Category {
    public static int categoryCounter = 0;
    private String cID;
    private String cName;

    public Category(String cName) {
        this.cID = String.format("%02d", ++categoryCounter);
        this.cName = cName;
    }

    public String getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cID='" + cID + '\'' +
                ", cName='" + cName + '\'' +
                '}';
    }
}
