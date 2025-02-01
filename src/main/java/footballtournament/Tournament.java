package footballtournament;

public class Tournament {

    private String tournamentName;
    private String[] teams;
    private String[] matches;

    public Tournament(String name,String[] teams, String[] matches)
    {
        this.tournamentName = name;
        this.teams = teams;
        this.matches = matches;
    }
}
