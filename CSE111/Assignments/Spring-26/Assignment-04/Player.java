public class Player {
    public String name;
    public int HP=100;
    public String [] list = new String[5];
    public int count=0;

    public Player (String name,int HP){
        this.name=name;
        this.HP=HP;
        System.out.println(name+" joined the game");
        System.out.println("HP: "+HP);
    }
    public Player(String name){
        this.name=name;
        System.out.println(name+" joined the game");
        System.out.println("HP: "+HP);
    }

    public void viewInfo(){
        System.out.println("Player Name: "+name);
        System.out.println("Current HP: "+HP);
        if (count!=0) {
            System.out.println("Defeated: ");
            for(int i =0;i<count;i++){
                System.out.print(list[i]+", ");
            }
            System.out.println();
        }
    }

    public void defeatVillain(String name,int HP){
        if (HP<=this.HP) {
            System.out.println("defeated "+name);
            this.HP+=HP;
            list[count]=name;
            count++;
        }
        else{
            System.out.println("failed to defeat "+name);
        }
    }
    public void defeatVillain(char x,String name,int HP){
        this.HP=this.HP*(x-'0');
        System.out.println("HP with "+x+"x boost: "+this.HP);
        if (HP<=this.HP) {
            System.out.println("defeated "+name);
            this.HP+=HP;
            list[count]=name;
            count++;
        }
        else{
            System.out.println("failed to defeat "+name);
        }
    }
    public void defeatVillain(Player obj){
        if (obj.HP<=this.HP) {
            System.out.println("defeated "+obj.name);
            this.HP+=obj.HP;
            list[count]=obj.name;
            count++;
        }
        else{
            System.out.println("failed to defeat "+obj.name);
        }
    }
}
