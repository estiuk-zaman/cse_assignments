public class CinemexTicket extends MovieTicket{
    public static int count;
    public String genre;
    public String ID;
    public boolean status;
    public String paid="Not Paid";

    public CinemexTicket(String name,String time,String genre,String Date){
        super(genre, Date, time, 0.0);
        this.genre=genre;
        count++;
        seat="Regular";
        ID=name+"-"+seat.charAt(0)+"-"+count;
    }
    public CinemexTicket(String name,String time,String genre,String Date,String seat){
        super(genre, Date, time, 0.0);
        this.genre=genre;
        count++;
        super.seat=seat;
        ID=name+"-"+seat.charAt(0)+"-"+count;
    }

    public static int getTotalTickets(){
        return count;
    }
    public void calculateTicketPrice(){
        double tk=0.0;
        for(int i =0;i<seatTypes.length;i++){
            if (seat==seatTypes[i]) {
                tk=seatPrices[i];
            }
        }
        String [] arr = showtime.split(":");
        int hour = Integer.parseInt(arr[0]);
        if (hour>=18 && hour<=23) {
            setPrice(tk+(tk*nightShowCharge)/100);
        }
        else{
            setPrice(tk);
        }
        System.out.println("Ticket price is calculated successfully.");
    }

    public String confirmPayment(){
        
        if (status) {
            return ("Ticket price is already paid!");
        }
        else{
            status=true;
            paid="Paid";
            return "Payment Successful.";
        }
    }

    public String toString(){
        return "Ticket ID: "+ID+"\n"+super.toString()+"\nGenre: "+genre+"\nSeat Type: "+seat+"\nPrice(tk): "+getPrice()+"\nStatus: "+paid;
    }
}
