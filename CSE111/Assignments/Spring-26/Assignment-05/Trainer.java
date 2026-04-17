public class Trainer {
    public String name;
    public double aver;
    public int ID;
    public static int count;
    public Pokemon [] arr= new Pokemon[7];
    public int arrCount;


    public Trainer(String name){
        this.name=name;
        count++;
        this.ID=count;
        System.out.println("Trainer ID: "+ID+", Name: "+name+" - created");
    }

    public void catchPokemon (Pokemon obj ){
        System.out.println(name+" caught: "+obj.getName());
        arr[arrCount]=obj;
        arrCount++;
    }
    
    public void viewPokeDex(){
        int temp=0;
        System.out.println(name+"'s Trainer Code: T"+ID);
        for(int i=0;i<arrCount;i++){
            System.out.println(arr[i].getName()+": "+arr[i].getHP()+" points");
            temp+=arr[i].getHP();
        }
        aver=temp/arrCount;
        System.out.println("Average of HP: "+aver);
    }

    public static void battle(Trainer obj,Trainer obj2){
        System.out.println("Battle info");
        System.out.println(obj.name+";s average HP: "+obj.aver);
        System.out.println(obj2.name+";s average HP: "+obj2.aver);
        if (obj.aver>obj2.aver) {
            System.out.println(obj.name+" wins");
        }
        else{
            System.out.println(obj2.name+" wins");
        }
    }

}
