public class Main {
    public static void main(String[] args) {
        Details detailsObj1 = new Details("Anirban", "Kolkata");
        Details detailsObj2 = new Details("Saikat", "Punjub");
        Details detailsObjMech1 = new Details("Ashok", "Kolkata");
        Driver dr1 = new Driver(detailsObj1, 1000.8, 7);
        Driver dr2 = new Driver(detailsObj2, 200.6, 4);
        Mechanic mech1 = new Mechanic(detailsObjMech1, 270.3, "mech1", true);

        Details detailsObj3 = new Details("Anirban", "Kolkata");
        Details detailsObj4 = new Details("Saikat", "Punjub");
        Driver dr3 = new Driver(detailsObj3, 1000.8, 10);
        Driver dr4 = new Driver(detailsObj4, 200.6, 4);

        Details detailsObj5 = new Details("Anirban", "Kolkata");
        Details detailsObj6 = new Details("Saikat", "Punjub");
        Driver dr5 = new Driver(detailsObj5, 1000.8, 5);
        Driver dr6 = new Driver(detailsObj6, 200.6, 4);

        Details detailsObj7 = new Details("Anirban", "Kolkata");
        Details detailsObj8 = new Details("Saikat", "Punjub");
        Driver dr7 = new Driver(detailsObj7, 1000.8, 6);
        Driver dr8 = new Driver(detailsObj8, 200.6, 9);

        Details detailsObj9 = new Details("Anirban", "Kolkata");
        Details detailsObj10 = new Details("Saikat", "Punjub");
        Driver dr9 = new Driver(detailsObj9, 1000.8, 3);
        Driver dr10 = new Driver(detailsObj10, 200.6, 7);
        // Mechanic mechObj = new Mechanic(detailsObj, 1200.0, "role1", false);

        Team team1 = new Team(dr1, dr2, "teamName1");
        team1.add(mech1);
        Team team2 = new Team(dr3, dr4, "teamName2");
        Team team3 = new Team(dr5, dr6, "teamName3");
        Team team4 = new Team(dr7, dr8, "teamName4");
        Team team5 = new Team(dr9, dr10, "teamName5");

        Team teamArray[] = {team1, team2, team3, team4, team5};

        Championship formula1 = new Championship();

        for (Team team: teamArray) {
            formula1.add(team);
            System.out.println(team.toString());
        }

        System.out.print(formula1.toString());
    }
}
