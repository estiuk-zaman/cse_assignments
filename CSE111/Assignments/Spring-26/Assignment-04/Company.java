public class Company {
    public String name = "ABC Company";
    public Employee [] arr = new Employee[3];
    public int count=0;

    public void addEmployee(Employee obj){
        if (count<3) {
            arr[count]=obj;
            count++;
            System.out.println(obj.getName()+" has joined the company");
        }
        else{
            System.out.println("No more vacancy");
        }
    }
    public void removeEmployee(Employee obj){
        int temp=0;
        for(int i =0;i<count;i++){
            if (arr[i]==obj) {
                temp=i;
            }
        }
        for(int j=temp;j<count-1;j++){
            arr[j]=arr[j+1];
        }
        count--;
        System.out.println(obj.getName()+" has left the company");
    }
    public void details(){
        System.out.println("Company Name: "+name);
        System.out.println("Total Employee: "+count);
        System.out.println("Fulltime Employee:");
        for(int i=0;i<count;i++){
            if(arr[i].getIsFulltime()){
                System.out.println("Name: "+arr[i].getName()+" ID: "+arr[i].getID());
            }
        }
        System.out.println("Part-time Employee: ");
        for(int i=0;i<count;i++){
            if(!arr[i].getIsFulltime()){
                System.out.println("Name: "+arr[i].getName()+" ID: "+arr[i].getID());
            }
        }
    }
}
