package Police;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    Policeman[] team;

    Team(int length) {
        this.team = new Policeman[length];
    }

    Team() {
        this(10);
    }

    public void addPolice(Policeman p) {
        for (int i = 0; i < team.length; i++) {
            if (team[i] == null) {
                team[i] = p;
            }
        }
    }

    public void removePolice(Policeman p) {
        for (int i = 0; i < team.length; i++) {
            if (team[i] == p) {
                team[i] = null;
            }
        }
    }

    public boolean removePoliceFromName(String name) {
        for (Policeman policeman: team) {
            if (Objects.equals(policeman.getFirstName(), name) || Objects.equals(policeman.getLastName(), name)) {

                return true;
            }
        }
            return false;
    }

    public boolean isPolicePresent(Policeman p) {
        for (Policeman policeman: team)
            if (policeman == p) {
                return true;
            }
        return false;
    }

    public String toStr(Policeman p) {
        return p.toStr();
    }

    public int getNumberPolice() {
        int counter = 0;
        for (Policeman policeman: team) {
            if (policeman != null) {
                counter++;
            }
        }   return counter;
    }

    public void clear() {
        Arrays.fill(team, null);
    }

    public double getAverageSalary() {
        double salaries = 0;
        int count = getNumberPolice();

        for (Policeman policeman: team) {
            salaries += policeman.getSalary();
        }   return salaries / count;
    }

    public void extendTeam() {
        Policeman[] newTeam = new Policeman[team.length + 50];
        System.arraycopy(team, 0, newTeam, 0, team.length);
        team = newTeam;
    }

    public boolean reduceTeam() {
        int numPolicemen = 0;
        for (Policeman p: team) {
            if (p != null) {
                numPolicemen++;
            }
        }
        if (numPolicemen >= team.length - 50) {
            return false;
        }
        Policeman[] newTeam = new Policeman[team.length - 50];
        System.arraycopy(team, 0, newTeam, 0, newTeam.length);
        team = newTeam;
        return true;
    }
}
