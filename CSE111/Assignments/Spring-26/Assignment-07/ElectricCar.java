public class ElectricCar extends Vehicle {
    public int nBattery;
    public static int count =0;

    public ElectricCar(String model,int price,int nBattery){
        super(model, price);
        this.nBattery=nBattery;
        count++;
        vehicleId="EV00"+count;
        System.out.println("Vehicle ID: "+vehicleId+" created");
    }

    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Electric Vehicle\nBattery Capacity: "+nBattery+" kWh");
    }

    public static void markAsSoldEV(ElectricCar obj){
       obj.sold=true;
    }


}
