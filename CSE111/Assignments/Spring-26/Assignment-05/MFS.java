public class MFS {
    public String name ;
    public String accNo ;
    public float balance;
    public boolean cardIsAdded;
    public Card card;

    public MFS(String accNo){
        this.accNo=accNo;
        System.out.println("Account created");
        System.out.println("AccNo: "+accNo);
        System.out.println("Balance: "+balance);
            System.out.println("Card not saved");
    }

    public void addMoneyFromCard(float tk){
        if (cardIsAdded) {
            if (card.balance>=tk) {
            balance+=tk;
            card.balance=card.balance-tk;
            System.out.println("Transfer successful.");
            System.out.println("New MFS account balance: "+balance+" tk.");
            System.out.println("Card balance: "+card.balance);
        }
        else{
            System.out.println("Insufficeint balance in "+card.name+" Card");
        }
    }
        else{
            System.out.println("Please add a card to your MFS account");
        }
    }
    
    public void addNewCard(Card obj){
        cardIsAdded=true;
        card=obj;
        System.out.println(obj.name+ " Card added to MFS acc#"+accNo);
    }
}
