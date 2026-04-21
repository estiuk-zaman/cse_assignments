public class Character {
    public static String Strongest;
    public static int Strongest_health;
    public static int kids,teens,adults,count;
    public static double sum;
    public int id,health;
    public String name,group;

    public Character(String name,String group,int health){
        this.name=name;
        this.group=group;
        this.health=health;
        count++;
        id=count;
        if (health>Strongest_health) {
            Strongest_health=health;
            Strongest=name;
        }
        sum+=health;
        if (group.equalsIgnoreCase("Kid")) {
            this.kids++;
        }
        else if (group.equalsIgnoreCase("Adult")) {
            this.adults++;
        }
        else{
            this.teens++;
        }
    }
    public Character(String name,int health){
        this.name=name;
        this.group="Teen";
        this.health=health;
        count++;
        id=count;
        if (health>Strongest_health) {
            Strongest_health=health;
            Strongest=name;
        }
        sum+=health;
        teens++;
    }

    public static void printStats(){
        System.out.println("Total Characters: "+count);
        System.out.println("Kids: "+kids);
        System.out.println("Teens: "+teens);
        System.out.println("Adults: "+adults);
        if (Strongest==null) {
            System.out.println("Average Health: 0");
            System.out.println("Strongest Character: None");
        }
        else{
            System.out.println("Average Health: "+(sum/count));
        System.out.println("Strongest Character: "+Strongest+" (Health "+Strongest_health+")");
        }
    }

    public void printDetails(){
        System.out.println("ID: "+id+", Name: "+name);
        System.out.println("Group: "+group);
        System.out.println("Health: "+health);
    }
}
