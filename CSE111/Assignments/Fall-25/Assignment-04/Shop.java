public class Shop {
    public String shop_name="";
    public int item_capacity=0;
    public String [] itemStrings;
    public int [] item_price;
    public int count=0;

    public Shop(String name,int capacity){
        shop_name=name;
        item_capacity=capacity;
        itemStrings=new String[capacity];
        item_price=new int[capacity];
        System.out.println(name+ " shop created!");
    }
    public Shop(int capacity){
        shop_name="Mega";
        item_capacity=capacity;
         itemStrings=new String[capacity];
        item_price=new int[capacity];
        System.out.println("Mega shop created!");
    }

    public void info(){
        System.out.println("Shop Name: "+ shop_name);
        System.out.println("Item Details:");
        if (count==0) {
            System.out.println("No items in shop");
        }
        else{
            System.out.println(count+"/"+item_capacity);
            for(int i =0;i<count;i++){
                System.out.println(itemStrings[i]+" - "+item_price[i]+" Tk");
            }
        }
    }

    public void addItem(String nam,int price){
        if (count<item_capacity) {
                itemStrings[count]=nam;
                item_price[count]=price;
                count++;
        }
        else{
            System.out.println(nam+" could not be added");
        }
    }
    public void addItem(Shop obj,String nam){
        boolean milse=false;
        if (count<item_capacity) {
            for(int i = 0;i<obj.count;i++){
                if (obj.itemStrings[i].equalsIgnoreCase(nam)) {
                    itemStrings[count]=nam;
                    item_price[count]=obj.item_price[i];
                    count++;
                    milse=true;
                    break;
                }
                else{
                    milse=false;
                }
            }
            if (!milse) {
                System.out.println(nam+" not found in "+obj.shop_name);
            }
        }
        else{
            System.out.println(nam+" could not be added");
        }
    }

    public void purchase(String nam){
        boolean isFound=false;
        for(int i =0;i<count;i++){
            if (itemStrings[i]==nam) {
                System.out.println("Purchase Completed!");
                isFound=true;
                break;
            }
        }
        if (!isFound) {
            System.out.println(nam+ " is not available in this shop");
        }
    }
}
