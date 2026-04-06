public class Spaceship {
    public String name;
    public int capacity;
    public int currentWeight;
    public Cargo [] list = new Cargo[100];
    public int count;

    public Spaceship(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    public void loadCargo(Cargo obj){
        int temp=currentWeight+obj.getWeight();
        if (temp>capacity) {
            System.out.println("Warning: Unable to load "+obj.getName()+" inside "+name+". Exceeds capacity by "+(temp-capacity));
        }
        else{
            currentWeight=temp;
            list[count]=obj;
            count++;
        }
    }

    public void displayDetails(){
        System.out.println("Spaceship Name: "+name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Current Cargo Weight: "+ currentWeight);
        System.out.print("Cargo: ");
        for(int i =0;i<count;i++){
            System.out.print(list[i].getName()+" ");
        }
        System.out.println();
    }

}
