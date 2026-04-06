public class TaxiLagbe {
    public String taxi_no = "";
    public String area = "";
    public int taka = 0;
    public int total_passenger = 0;
    public String passenger="";

    public TaxiLagbe(String taxi_no,String area){
        this.taxi_no=taxi_no;
        this.area=area;
        System.out.println("A new taxi has been created");
    }
    public TaxiLagbe(String taxi_no){
        this.taxi_no=taxi_no;
        this.area="Khulna";
        System.out.println("A new taxi has been created");
    }
    public void addPassenger(String name,int taka){
        passenger=passenger+" "+name;
        total_passenger++;
        this.taka+=taka;
        System.out.println("Dear "+ name+ " ! Welcome to TaxiLagbe");
    }
    public void addPassenger(String name,int taka,String name01,int taka01){
        passenger=passenger+" "+name+" "+name01;
        total_passenger=total_passenger+2;
        this.taka+=taka+taka01;
        System.out.println("Dear "+ name+ " ! Welcome to TaxiLagbe");
        System.out.println("Dear "+ name01+ " ! Welcome to TaxiLagbe");
    }
    public void printDetails(){
        System.out.println("Taxi number: "+ taxi_no);
        System.out.println("This taxi can cover "+ area+" area");
        System.out.println("Total Passenger: "+total_passenger);
        System.out.println("Passenger List:");
        System.out.println(passenger);
        System.out.println("Total collected fare: "+ taka+" Taka");
    }
}
