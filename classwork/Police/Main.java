package Police;

public class Main {
    public static void main(String[] args) {
        Policeman p1 = new Policeman("Ricardo", "Saad", 15000);
        Policeman p2 = new Policeman("Saad", 12000);
        Policeman p3 = new Policeman("Steve", "Jobs", 9000);
        displays(p3);
        p3.increaseSalary(1000);
        displays(p3);

        System.out.println(toStr(p1));
        System.out.println(p2.ID());

        /////////////////////////////////////////////////////////////////////////////////

        Team beirut = new Team(10);

        beirut.addPolice(p1);
        beirut.addPolice(p2);
        beirut.addPolice(p3);
        beirut.addPolice(new Policeman("John", "Doe", 55000));
        beirut.addPolice(new Policeman("Richard", 15000));
        beirut.addPolice(new Policeman("Mike", "Hawk", 9000));

        beirut.isPolicePresent(p3);
        beirut.removePoliceFromName("John");
        beirut.removePolice(p2);

        int beirutTeamCounter = beirut.getNumberPolice();
        double averageSalary = beirut.getAverageSalary();

        System.out.println("Counter: " + beirutTeamCounter);
        System.out.println("Average Salary: " + averageSalary);

        beirut.extendTeam();
        beirut.reduceTeam();

        /////////////////////////////////////////////////////////////////////////////////

        Policeman c1 = new Captain("","",1500, true);

    }
    public Team addAll(Team t) {
        Team x = new Team();

        for (int i = 0; i < t.team.length; i++) {
            x.addPolice(t.team[i]);
        }
        return x;
    }

    public static void displays(Policeman p) {
        System.out.println("First Name: " + p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());
        System.out.println("Salary: " + p.getSalary());
    }
    
    public static String toStr(Policeman p) {
        return p.getFirstName() + " " + p.getLastName();
    }
}
