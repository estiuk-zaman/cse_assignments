public class Team {
    public String name;
    public Player_01 [] list = new Player_01[11];
    public int count=0;

    public Team(String name){
        this.name=name;
    }
    public Team(){

    }
    
    public void updateName(String name){
        this.name=name;
    }

    public void addPlayer(Player_01 obj){
        if (count<11) {
            list[count]=obj;
            count++;
        }
    }

    public void printDetail(){
        System.out.println("Team: "+name);
        System.out.println("List of players:");
        for(int i =0;i<count;i++){
            System.out.println("Name: "+list[i].getName());
            System.out.println("Age: "+list[i].getAge()+", Total Matches: "+list[i].getMatches());
        }
    }
}
