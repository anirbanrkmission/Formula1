import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Comparable;
import java.lang.Iterable;

public class Team implements Comparable<Team>, Iterable<Mechanic> {
    ArrayList<Mechanic> mechanicList;
    Driver driver1, driver2;
    String name;
    int points;

    Team() {
    }

    Team(Driver dr1, Driver dr2, String teamName) {
        this.driver1 = dr1;
        this.driver2 = dr2;
        this.name = teamName;
        this.mechanicList = new ArrayList<Mechanic>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String teamName) {
        this.name = teamName;
    }

    public int getPoints() {
        this.calculatePoints();
        return this.points;
    }

    public void calculatePoints() {
        this.points = driver1.points + driver2.points;
    }

    public Driver getDriver1() {
        return this.driver1;
    }

    public void setDriver1(Driver drObj1) {
        this.driver1 = drObj1;
    }

    public Driver getDriver2() {
        return this.driver2;
    }

    public void setDriver2(Driver drObj2) {
        this.driver2 = drObj2;
    }

    public void add(Mechanic mech) {
        this.mechanicList.add(mech);
    }

    public void remove(int indexOfRemoveItems) {
        this.mechanicList.remove(indexOfRemoveItems);
    }

    public int size() {
        return this.mechanicList.size();
    }

    public String toString() {
        String resultStr = " First Driver: " + this.driver1.toString();
        resultStr += " Second Driver: " + this.driver2.toString() + " \n";
        for (Mechanic mech : this.mechanicList) {
            resultStr += mech.toString() + "\n";
        }
        return resultStr + " Name of the team: " + this.name + " total points of team: " + this.getPoints() + "\n";
    }

    @Override
    public int compareTo(Team team) {
        if (this.points < team.points) {
            return -1;
        } else {
            if (this.points == team.points) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    @Override
    public Iterator<Mechanic> iterator() {
        return this.mechanicList.iterator();
    }
}
