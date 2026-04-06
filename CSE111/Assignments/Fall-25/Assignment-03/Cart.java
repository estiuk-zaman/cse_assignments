public class Cart {
   public String [] name ;
   public double [] price;
   public int cart_name =0;
   public int count = 0;
   public double discount=0.0;
   
   public void create_cart(int i){
    cart_name=i;
    name = new String[3];
    price = new double[3];
   }

   public void addItem(String nam,Double pr){
    if (count<=2) {
    name[count]=nam;
    price[count]=pr;
    count++;
    System.out.println(nam+" added to cart "+cart_name);
    System.out.println("You have added "+count+" item(s) to your cart");
    }
    else{
        System.out.println("You already have 3 items on your cart");
    }

   }
    public void addItem(Double pr,String nam){
     if (count<=2) {
    name[count]=nam;
    price[count]=pr;
    count++;
      System.out.println(nam+" added to cart "+cart_name);
    System.out.println("You have added "+count+" item(s) to your cart");
    }
    else{
        System.out.println("You already have 3 items on your cart");
    }
   }

   public void giveDiscount(double dis){
    discount=dis;
   }

   public void cartDetails(){
    double priceSum=0;
    priceSum=price[0]+price[1]+price[2];
    double total_price=priceSum-(priceSum*discount/100);
    System.out.println("Your cart(c"+cart_name+") :");
    for(int i =0;i<count;i++){
        System.out.println(name[i]+" - "+price[i]);
    }
    System.out.println("Discount Applied: "+discount+"%");
    System.out.println("Total Price: "+ total_price);
   }
}

