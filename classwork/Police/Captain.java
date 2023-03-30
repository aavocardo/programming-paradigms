package Police;

public class Captain extends Policeman {
    protected boolean captain;
    Captain(String firstName, String lastName, double salary, boolean captain){
        super(firstName, lastName, salary);
        this.captain = captain;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public boolean isCaptain() {
        return this.captain;
    }
}
