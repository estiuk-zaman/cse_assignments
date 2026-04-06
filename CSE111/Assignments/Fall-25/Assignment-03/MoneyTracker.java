public class MoneyTracker {
    public String name="null";
    public double balance=0.0;
    public double last_added=0.0;
    public double last_spent=0.0;

    public MoneyTracker(){
        System.out.println("A new money tracker has been launched.");
    }

    public String info(){
        return "Name: "+name+"\n"+"Current Balance: "+balance;
    }

    public void createTracker(String name){
        this.name=name;
        this.balance=1.0;
    }

    public void income(double income){
        balance=balance+income;
        last_added=income;
        System.out.println("Balance Updated.");
    }

    public void expense(double expense){
        if (balance>=expense) {
            balance=balance-expense;
            if (balance==0) {
                System.out.println("You are broke!");
            }
            else{
                System.out.println("Balance Updated");
            }
            last_spent=expense;
        }
        else{
            System.out.println("Not enough balance.");
        }
    }

    public void showHistory(){
        System.out.println("Last added: "+last_added);
        System.out.println("Last spent: "+last_spent);
    }
}
