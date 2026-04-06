public class BracuBus {
    public String route;
    public int capacity=2;
    public String [] list;
    public int count=0;

    public BracuBus(String route){
        this.route=route;
        list=new String[capacity];
    }
    public BracuBus(String route,int capacity){
        this.route=route;
        this.capacity=capacity;
        list= new String[capacity];
    }

    public void showDetails(){
        System.out.println("Bus Route: "+route);
        System.out.println("Passenger count: "+count+"(Max: "+capacity+")");
        if (count!=0) {
        for(int i =0;i<count;i++){
            System.out.print(list[i]+" ");
        }
    }
    }
    
    public void board(){
        System.out.println("No passenger");
    }
    public void board(BracuStudent obj1){
        if (count<capacity) {
        if (obj1.getLocation().equalsIgnoreCase(route)) {
            if (obj1.pass) {
                System.out.println(obj1.name+" boarded the bus.");
                list[count]=obj1.name;
                count++;
            }
            else{
                System.out.println("You don't have a board pass!");
            }
        }
        else{
            System.out.println("You got on the wrong bus!");
        }
    }
    else{
        System.out.println("Bus is full!");
    }
    }
    public void board(BracuStudent obj1,BracuStudent obj2){
        if (count<capacity) {
        if (obj1.getLocation().equalsIgnoreCase(route)) {
            if (obj1.pass) {
                System.out.println(obj1.name+" boarded the bus.");
                list[count]=obj1.name;
                count++;
            }
            else{
                System.out.println("You don't have a board pass!");
            }
        }
        else{
            System.out.println("You got on the wrong bus!");
        }
    }
    else{
        System.out.println("Bus is full!");
    }
      if (count<capacity) {
        if (obj2.getLocation().equalsIgnoreCase(route)) {
            if (obj2.pass) {
                System.out.println(obj2.name+" boarded the bus.");
                list[count]=obj2.name;
                count++;
            }
            else{
                System.out.println("You don't have a board pass!");
            }
        }
        else{
            System.out.println("You got on the wrong bus!");
        }
    }
    else{
        System.out.println("Bus is full!");
    }
    }
}
