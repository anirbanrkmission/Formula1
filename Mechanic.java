public class Mechanic extends TeamMember{
    String role;
    boolean atRace;

    Mechanic() {}
    Mechanic(Details d, double sal, String role, boolean race) {
        super(d, sal);

        this.role=role;
        this.atRace=race;
    }

    public String getRole() {
        return this.role;
    }
    public void setRole(String role) {
        this.role=role;
    }

    public boolean isAtRace() {
        return this.atRace;
    }
    public void setAtRace(boolean race) {
        this.atRace=race;
    }

    public String toString() {
        return (this.atRace)? super.toString() + " Role: " + this.role + " at race.\n" : 
                super.toString() + " Role: " + this.role + " not at race.\n";
    }
}
