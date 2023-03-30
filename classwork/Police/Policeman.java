package Police;

import java.util.UUID;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Policeman {
    protected String firstName, lastName;
    private final String id;
    protected double salary;
    Policeman(String fName, String lName, double salary) {
        this.firstName = fName;
        this.lastName = lName;
        this.salary = salary;
        this.id = toUpperCase(UUID.randomUUID().toString().replaceAll("[^a-zA-Z0-9]", "").substring(0, 8));
    }

    Policeman(String lName, double salary) {
        this("Jon", lName, salary);
    }

    public String toStr() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String s) {
        this.firstName = s;
    }
    
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String s) {
        this.lastName = s;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return this.salary;
    }
    public String ID() {
        return this.id;
    }
    public void increaseSalary(int raise) {
        this.salary += raise;
    }
}
