public class PremiumRide extends Ride {
    private static int idNo;
    // CORRECTION 1: idNo static thakay shob object er jonnoi change hoto. 
    // Tai protita object er nijoshho ID dhore rakhar jonno myId add kora hoyeche.
    private int myId; 
    
    public boolean surge;
    public boolean discount;

    public PremiumRide(int distance, boolean surge){
        super(distance);
        this.surge = surge;
        idNo++;
        this.myId = idNo; // Constructor call hole current ID ta save kore nibe
    }

    public String getId(){
        // CORRECTION 2: getDistance() theke 15.0 ba 12.0 ashto. 
        // (int) use kore decimal baad deya hoyeche jate output "1-15" ashe.
        return (myId + "-" + (int)getDistance()); 
    }

    public double calculateFare(){
        if (surge) {
            // CORRECTION 3: 40 hardcode kora chilo. Kintu onno distance e surge er amount change hobe.
            // Tai (Fare + Service Charge) er 20% ber korar main formula ta boshanoh hoyeche.
            return getDistance()*10 + 50 + ((getDistance()*10 + 50) * 20 / 100.0);
        }
        else{
            return getDistance()*10 + 50;
        }
    }

    public double calculateFare(int discount){
        this.discount = true;
        if (surge) {
            // CORRECTION 4: Ekhaneo 40 er bodole exact formula boshiye discount minus kora hoyeche.
            return getDistance()*10 + 50 + ((getDistance()*10 + 50) * 20 / 100.0) - discount;
        }
        else{
            return getDistance()*10 + 50 - discount;
        }
    }

    public String toString(){
        // CORRECTION 5: First line e " km" chilo na, ebong distance 15.0 ashto. 
        // (int) ebong " km" add kore exact expected output er moto kora hoyeche.
        return "Distance: " + (int)getDistance() + " km\nID: " + getId() + "\nService Charge: 50 TK\nSurge: " + surge + "\nDiscount: " + discount;
    }
}