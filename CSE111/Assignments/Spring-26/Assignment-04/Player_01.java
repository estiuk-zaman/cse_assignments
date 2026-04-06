public class Player_01 {
    private String name;
    private int age;
    private int matches;

    public Player_01(String name,int age ,int matches){
        this.name=name;
        this.age=age;
        this.matches=matches;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setMatches(int matches){
        this.matches=matches;
    }
    public int getMatches(){
        return this.matches;
    }
    
}
