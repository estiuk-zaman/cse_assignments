public class Car extends Vehicle{
    public static Car [] allCars = new Car[0];
    public static int count =0;
    public int seat = 0;
    public static int Available;

    public Car (String model,int price,int seat){
        super(model, price);
        this.seat=seat;
        count++;
        Available++;
        vehicleId="CAR00"+count;
        Car [] newArr = new Car[allCars.length+1];
        for(int i =0;i<allCars.length;i++){
            newArr[i]=allCars[i];
        }
        newArr[allCars.length]=this;
        allCars=newArr;
        System.out.println("Vehicle ID: "+vehicleId+" created");
    } 

    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Regular\nSeats: "+seat);
    }

    public static void showAllAvailableCars(){
        System.out.println("Total Car: "+Available+"\nAvailable Cars:");
        for(int i =0;i<allCars.length;i++){
            if (!allCars[i].sold) {
                System.out.println(allCars[i].vehicleId+" : "+allCars[i].model);
            }
        }

    }

    public static void markAsSold (Car obj){
        Available=Available-1;
        obj.sold=true;
    }

    public static void showAllCars() {
    System.out.println("Total Car: " + count);
    for (int i = 0; i < allCars.length; i++) {
        if (allCars[i].sold) {
            System.out.println(allCars[i].vehicleId + " : " + allCars[i].model + " - sold");
        } else {
            System.out.println(allCars[i].vehicleId + " : " + allCars[i].model + " - available");
        }
    }
}
}
