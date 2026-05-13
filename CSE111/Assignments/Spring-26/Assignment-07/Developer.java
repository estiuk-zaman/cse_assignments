public class Developer extends Employee{
    public String language;
    public double finalSalary;

    public Developer(String name,int base,int hour,String lan){
        super(name, base, hour);
        this.language=lan;
    }
    public void calculateSalary(){
        if (language.equals("Java")) {
            finalSalary=getBaseSalary()+700;
        }
        else {
        finalSalary = getBaseSalary();
    }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+language+"\nFinal Salary: $"+finalSalary);
    }
}
