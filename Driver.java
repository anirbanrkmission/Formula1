public class Driver extends TeamMember {
    int points;

    public Driver() {}
    public Driver(Details d, double sal, int point) {
        super(d, sal);
        this.points=point;
    }

    public int getPoints() {
        return this.points;
    }
    public void addPoint(int p) {
        this.points=p;
    }
    public String toString() {
        return super.toString() + " Point: " + Integer.toString(this.points) + " \n";
    }
}
