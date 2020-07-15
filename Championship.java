import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Championship implements Iterable {
    List<Team> teams;

    Championship() {
        this.teams = new ArrayList<Team>();
    }

    public void sortTeamsOnPoint() {
        Collections.sort(this.teams);
    }
    public void add(Team team) {
        this.teams.add(team);
    }
    public void remove(int index) {
        this.teams.remove(index);
    }

    public Team get(int index) {
        return this.teams.get(index);
    }
    public int size() {
        return this.teams.size();
    }
    public void clear() {
        this.teams.clear();
    }

    public String toString() {
        this.sortTeamsOnPoint();
        return "Champion: " + this.teams.get(this.teams.size()-1).name;
    }

	@Override
	public Iterator<Team> iterator() {
		return this.teams.iterator();
	}
}