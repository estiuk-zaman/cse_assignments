public class TravelPrep {
    public String t_name="Unknown",place_name;
    public int package_cost=1250,place_cost=300,place_count=0,total_place_cost=0;
    public TravelPrep [] arr = new TravelPrep[3];

    public TravelPrep(){
        System.out.println(t_name+ " package would cost at most "+package_cost+" yen");
    }
    public TravelPrep(String name,int cost){
        this.t_name=name;
        this.package_cost=cost;
        System.out.println(t_name+ " package would cost at most "+package_cost+" yen");
    }
    public TravelPrep(String n1,String n2){
        place_name=n2+n1;
        System.out.println(place_name+" cpsts "+place_cost+" yen");
    }
    public TravelPrep(String n1,String n2,int cost){
        place_name=n2+n1;
        place_cost=cost;
         System.out.println(place_name+" cpsts "+place_cost+" yen");
    }

    public void add_to_itinerary(TravelPrep obj){
        int temp=total_place_cost+obj.place_cost;
        if ((temp<=package_cost)&& place_count<3) {
                    arr[place_count]=obj;
                    total_place_cost+=obj.place_cost;
                        place_count++;
        }
        else{
            System.out.println("Budget going overboard");
        }
    }
    public void add_to_itinerary(TravelPrep obj,TravelPrep obj_01){
        int temp=total_place_cost+obj.place_cost+obj_01.place_cost;
        if ((temp<=package_cost) && place_count<3) {
                    arr[place_count]=obj;
                    total_place_cost+=obj.place_cost;
                        place_count++;
                        arr[place_count]=obj_01;
                        total_place_cost+=obj_01.place_cost;
                        place_count++;

        }
        else{
            System.out.println("Budget going overboard");
        }
    }

    public void show_itinerary(){
        System.out.println("Itinerary for "+t_name);
        for(int i =0;i<place_count;i++){
            System.out.println((i+1)+"."+arr[i].place_name+" - "+arr[i].place_cost+" yen");
        }
        System.out.println("Total cost of "+place_count+" destinations: "+total_place_cost+" yen");
    }

    public String updateCost(int tk){
        this.place_cost+=tk;
        return "Cost of "+this.place_name+" updated to "+(this.place_cost);
    }
}
