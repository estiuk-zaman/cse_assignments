public class Shop {
    public String shop_name="Mega";
    public int capacity;
    public int count=0;
    public String [] item_name;
    public int [] item_price;

    public Shop (String shop_name,int capacity){
        this.shop_name=shop_name;
        this.capacity=capacity;
        item_name = new String[capacity];
        item_price = new int[capacity];
        System.out.println(shop_name+" shop created!");
    }
    public Shop (int capacity){
        this.capacity=capacity;
        item_name = new String[capacity];
        item_price = new int[capacity];
        System.out.println(shop_name+" shop created!");
    }

    public void addItem(String nam,int price){
        if (count<capacity) {
            item_name[count]=nam;
            item_price[count]=price;
            count++;
        }
        else{
            System.out.println(nam+" could not be added");
        }
    }
    public void addItem(Shop nam,String item){
                boolean isfound=false;
         if (count<capacity) {
            for(int i =0;i<nam.count;i++){
                if (nam.item_name[i].equalsIgnoreCase(item)) {
                    item_name[count]=nam.item_name[i];
            item_price[count]=nam.item_price[i];
            count++;
            isfound=true;
            break;
                }
            }
        }
        if (!isfound){
            System.out.println(item+" not found in "+nam.shop_name);
        }
    }

public void purchase(String prod){
            boolean isfound=false;
    for(int i =0;i<count;i++){
        if (item_name[i].equalsIgnoreCase(prod)) {
            System.out.println("Purchase Complete!");
            isfound=true;
            break;
        }
    }
     if (!isfound){
            System.out.println(prod+ " is not available in this shop");
        }
}

public void info() {
    System.out.println("Shop name: "+shop_name);
    System.out.println("Item Details: ");
    if (count==0) {
        System.out.println("No items in shop");
    }
    else{
    System.out.println(count+"/"+capacity);
    for(int i =0;i<count;i++){
        System.out.println(item_name[i]+" - "+item_price[i]);
    }
      }
}
}

