public class Cricket_Tournament extends Tournament{
    public int team;
    public String type;
    
    public Cricket_Tournament(){
        type="No type";
    }
    public Cricket_Tournament(String name,int team,String type){
        super(name);
        this.team=team;
        this.type=type;
    }

    public String info(){
        return String.format("Cricket Tournament Name: %s\nNumber of Teams: %d\nType: %s",super.getName(),team,type);
    }
}
