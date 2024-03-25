public abstract class Person {
    protected String name;
    protected String surname;
    protected String dob;

    public Person(String name, String surname, String dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    // Getters
    public abstract String getName();

    public abstract String getSurname();

    public abstract String getDob();

    // Setters
    public abstract void setName(String name);
    public abstract void setSurname(String surname);

    public abstract void setDob(String dob);
}
