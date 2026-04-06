public class Team {
    public String name="";
    public Player [] member = new Player[11];
    public int count=0;
    
    public Team(String name){
        this.name=name;
    }
    public Team(){
        
    }
    public void updateName(String name){
        this.name=name;
    }

    public void addPlayer(Player obj){
        member[count]=obj;
        count++;
    }

    public void printDetail(){
        System.out.println("Team: "+name);
        System.out.println("List of players:");
        for(int i=0;i<count;i++){
            System.out.println("Name: "+member[i].name);
            System.out.println("Age: "+member[i].age+",Total Matches: "+member[i].total_match);
        }
    }
}
