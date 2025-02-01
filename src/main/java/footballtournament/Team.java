package footballtournament;

public class Team {

    private String teamName;
    private String[] players;

    public Team(String teamName,String[] players)
    {
        this.teamName = teamName;
        this.players =  players;
    }

    // get team name and all the players in the team

    public void getTeamName()
    {
        System.out.println(this.teamName);
    }
}
