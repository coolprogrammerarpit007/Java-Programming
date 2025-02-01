package footballtournament;

public class Player {

    private String playerName;
    private int playerAge;
    private String position;
    private Team team;

    public Player(String playerName,int age,String position,Team team)
    {
        this.playerName = playerName;
        this.playerAge = age;
        this.position = position;
        this.team = team;
    }

    public void getPlayerName()
    {
        System.out.println(this.playerName);
    }
}
