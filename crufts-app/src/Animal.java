public abstract class Animal {

    // Variables
    protected String name;
    protected String colour;
    protected String dob;
    protected String gender;

    public Animal(String name, String colour, String dob, String gender) {
        this.name = name;
        this.colour = colour;
        this.dob = dob;
        this.gender = gender;
    }

    // Getters
    public abstract String getName();
    public abstract String getColour();
    public abstract String getDob();
    public abstract String getGender();

    // Setters
    public abstract void setName(String name);

    public abstract void setColour(String colour);

    public abstract void setDob(String dob);

    public abstract void setGender(String gender);
}
