public class Toy {
    public String name = "";
    public int price = 0;
    public Toy(String name,int price){
        this.name=name;
        this.price=price;
        System.out.println("A new toy has been made!");
    }
    public void updatePrice(int taka){
        price=taka;
    }
    public void showPrice(){
        System.out.println("price: "+ price+ "Taka");
    }
    public void updateName(String New){
        System.out.println("Changing old name: "+ name);
        System.out.println("new name: "+New);
        name=New;
    }
}
