public class Card {
    public String name ;
    public float balance;

    public Card(float balance,String name){
        this.balance=balance;
        this.name=name;
        System.out.println(name+" Card created successfully");
        System.out.println("Balance: "+balance);
    }

    public void addMoneyFromAccount(float tk,MFS obj){
        if (obj.balance>=tk) {
            balance+=tk;
            obj.balance-=tk;
            System.out.println("Added "+ (int)tk+" tk to card from MFS");
            System.out.println("account#"+obj.accNo);
            System.out.println("New balance in card: "+balance);
        }
        else{
            System.out.println("Insufficient acclount balance!");
        }
    }

    
}
