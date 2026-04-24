public class Tennis_Tournament extends Tournament{
    public int players;
    public Tennis_Tournament(String name,int players){
        super(name);
        this.players=players;
    }

    public String info(){
        return String.format("Tennis Tournament Name: %s\nNumber of Players: %d",super.getName(),players);
    }
}
