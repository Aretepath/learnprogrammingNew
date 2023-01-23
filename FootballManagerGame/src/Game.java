class Game {
    private FootballTeam homeTeam;
    private FootballTeam awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;

    public Game(FootballTeam homeTeam, FootballTeam awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamScore = 0;
        this.awayTeamScore = 0;
    }

    public Game(String[] chelseaTeam, String[] bayernMunichTeam) {
    }

    public void setHomeTeamScore(int score) {
        this.homeTeamScore = score;
    }

    public void setAwayTeamScore(int score) {
        this.awayTeamScore = score;
    }

    public FootballTeam getWinner() {
        if (homeTeamScore > awayTeamScore) {
            return homeTeam;
        } else if (awayTeamScore > homeTeamScore) {
            return awayTeam;
        } else {
            return null;
        }
    }

    public FootballTeam getLoser() {
        if (homeTeamScore < awayTeamScore) {
            return homeTeam;
        } else if (awayTeamScore < homeTeamScore) {
            return awayTeam;
        } else {
            return null;
        }
    }
}