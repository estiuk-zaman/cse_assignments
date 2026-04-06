public class Player_01 {
    public String name="";
    public int HP = 0;
    public String [] defeated= new String[5];
    public int count=0;

    public Player_01(String name,int HP){
        this.name=name;
        this.HP=HP;
        System.out.println(name+" joined the game");
    }
    public Player_01(String name){
        this.name=name;
        HP=100;
        System.out.println(name+" joined the game");
    }

    public void viewInfo(){
        System.out.println("Player name: "+ name);
        System.out.println("Current HP: "+HP);
        if (count>0) {
            System.out.println("Defeated: ");
            for(int i =0;i<count;i++){
                System.out.print(defeated[i]+",");
            }
        }
        System.out.println();
    }

    public void defeatVillain(String villName,int villHP){
        if (HP>=villHP) {
            System.out.println("defeated "+ villName);
            HP+=villHP;
            defeated[count]=villName;
            count++;
        }
        else{
            System.out.println("failed to defeat "+ villName);
        }
    }
    public void defeatVillain(char boost,String villName,int villHP){
        int boost_01=boost-'0';
        HP=HP*boost_01;
        System.out.println("HP with "+boost_01+"x boost: "+ HP);
        if (HP>=villHP) {
            System.out.println("defeated "+ villName);
            HP+=villHP;
            defeated[count]=villName;
            count++;
        }
        else{
            System.out.println("failed to defeat "+ villName);
        }
    }
    public void defeatVillain(Player_01 obj){
        if (HP>=obj.HP) {
             System.out.println("defeated "+ obj.name);
            HP+=obj.HP;
            defeated[count]=obj.name;
            count++;
        }
        else{
             System.out.println("failed to defeat "+ obj.name);
        }
    }
}
