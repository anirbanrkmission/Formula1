public class TeamMember extends Details {
    Details detail;
    double salary;

    TeamMember() {}
    TeamMember(Details d, double sal) {
        super(d.fullname, d.address);
        this.salary=sal;
    }

    public Details geDetails() {
        return this.detail;
    }
    public void setDetails(Details d) {
        this.detail=d;
    }

    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double sal) {
        this.salary = sal;
    }

    public String toString() {
        return super.toString() + " Salary: " + Double.toString(this.salary) + " \n";
    }

    public boolean equals(TeamMember tm) {
        if (tm.detail == this.detail && tm.salary == this.salary) {
            return true;
        }
        else {
            return false;
        }
    }
}
