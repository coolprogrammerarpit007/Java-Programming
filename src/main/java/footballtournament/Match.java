package footballtournament;

public class Match {
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;
    private Team winner;

    public Match(Team team1,Team team2,int score1,int score2,Team winner)
    {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
        this.winner = winner;
    }
}
