public class MobilePhone {
    public String [] name;
    public int [] num;
    public int capacity=0;
    public int count=0;

    public void setContactCapacity(int capacity){
        this.capacity=capacity;
        name= new String[capacity];
        num= new int [capacity];
    }

    public void addContact(String name,int num){
        if (count<capacity) {    
        this.name[count]=name;
        this.num[count]=num;
        count++;
        System.out.println("The contact of "+name+" is added.");
        }
        else{
            System.out.println("Storage full !!");
        }
    }

    public void makeCall(int num){
        boolean isFound=false;
        for(int i =0;i<count;i++){
            if (this.num[i]==num) {
                System.out.println("Calling "+ this.name[i]+" . . .");
                isFound=true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Calling "+ num+" . . .");
        }
    }

    public void details(){
        System.out.println("Total Contacts: "+count);
        System.out.println("Contact List:");
        for(int i =0;i<count;i++){
            System.out.println(this.name[i]+":"+this.num[i]);
        }
    }
}
