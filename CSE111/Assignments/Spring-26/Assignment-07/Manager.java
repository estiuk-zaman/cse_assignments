public class Manager extends Employee{
    public double bonus;
    public double finalSalary;

    public Manager(String name,int base,int hour,int bonus){
        super(name, base, hour);
        this.bonus=bonus;
    }

    public void calculateSalary(){
        finalSalary = getBaseSalary() + getBaseSalary() * (bonus/100.0);;
    }

    public void requestIncrement(int tk){
        if (getHoursWorked()>80 && getHoursWorked()<=100) {
            setBaseSalary(getBaseSalary() + tk/2);
            System.out.println("$"+tk/2+" Increment approved.");
        }
        else if (getHoursWorked()>100) {
            setBaseSalary(getBaseSalary() + tk);
            System.out.println("$"+tk+" Increment approved.");
        }
        else{
            System.out.println("Increment denied.");
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+bonus+"%\nFinal Salary: $"+finalSalary);
    }

}
