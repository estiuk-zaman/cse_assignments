public class Employee {
    public  String name="";
    public  double salary = 30000.0;
    public  String designation="junior";

    public  void newEmployee(String nam){
        name=nam;
    }
    public  void displayInfo(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Designation: "+designation);
    }
    public  void calculateTax(){
        double tax =0;
        if (salary>30000 && salary<50000) {
            tax=salary*0.1;
        }
        else if (salary>50000) {
            tax=salary*0.3;
        }
        else{
            System.out.println("No need to pay tax");
        }
        System.out.println(name+ " Tax Amount: "+ tax);
    }

    public void promoteEmployee(String promo){
        if (promo.equals("senior")) {
            designation="Senior";
            salary=salary+25000;
            System.out.println(name+" has been promoted to "+ designation);
            System.out.println("New salary: "+ salary);
        }
        else if (promo.equals("lead")) {
            designation="Lead";
            salary=salary+50000;
            System.out.println(name+" has been promoted to "+ designation);
            System.out.println("New salary: "+ salary);
        }
        else if (promo.equals("manager")) {
            designation="Manager";
            salary=salary+75000;
            System.out.println(name+" has been promoted to "+ designation);
            System.out.println("New salary: "+ salary);
        }
    }
}
