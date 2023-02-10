public class Main {
    public static void main(String[] args) {


        //int[] playerNumber = {1,2,3,4,5,6,7,8,9,10,11};
        FootballTeam team = new FootballTeam();
        Game Result = new Game(team.chelseaTeam,team.bayernMunichTeam);
        team.setCoachName("Richard");
        //team.setPlayerName(team.chelseaTeam, String.valueOf(team.playerNumber));
        team.setPlayerName(team.bayernMunichTeam, String.valueOf(team.playerNumber));
        Result.setAwayTeamScore(4);
        Result.setHomeTeamScore(2);
        team.printTeamInfo();


        
    }
}