public class FootballTeam {
    private String teamName;
    private String coachName;
    private String[] playerNames;
    private int[] playerNumbers;
    private int gamesWon;
    private int gamesLost;

    public FootballTeam(String teamName, String coachName, String[] playerNames, int[] playerNumbers) {
        this.teamName = teamName;
        this.coachName = coachName;
        this.playerNames = playerNames;
        this.playerNumbers = playerNumbers;
        this.gamesWon = 0;
        this.gamesLost = 0;
    }

    public FootballTeam() {

    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void setPlayerName(String[] playerNumber, String playerName) {
        this.playerNames[playerNumber] = playerName;
    }

    public void gameWon() {
        this.gamesWon++;
    }

    public void gameLost() {
        this.gamesLost++;
    }

    String[] bayernMunichTeam = {
            "Manuel Neuer", "Benjamin Pavard", "Jerome Boateng", "David Alaba", "Alphonso Davies",
            "Joshua Kimmich", "Leon Goretzka", "Thomas Muller", "Serge Gnabry", "Kingsley Coman",
            "Robert Lewandowski"
    };

    int chelseaTeam = {
            "Kepa Arrizabalaga", "Reece James", "Thiago Silva", "Kurt Zouma", "Ben Chilwell",
            "N'Golo Kante", "Jorginho", "Mason Mount", "Timo Werner", "Hakim Ziyech",
            "Kai Havertz"
    };

    int[] playerNumber = {1,2,3,4,5,6,7,8,9,10,11};

    public void printTeamInfo() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Coach Name: " + coachName);
        System.out.println("Player Names:");
        for (int i = 0; i < playerNames.length; i++) {
            System.out.println(playerNumbers[i] + ": " + playerNames[i]);
        }
        System.out.println("Games Won: " + gamesWon);
        System.out.println("Games Lost: " + gamesLost);
    }
}
