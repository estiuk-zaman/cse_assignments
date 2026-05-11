public class Concert{
    public String name;
    public String showTime;
    public String [] artist= new String[5];
    public int artistCount=0;
    public static int TotalTickets;
    public int count;

    public Concert(String name,String showTime){
        this.name=name;
        this.showTime=showTime;
    }

    public void showDetails(){
        System.out.println("Venue: "+name+"\nShowtime: "+showTime+"\nArtist:");
        for(int i =0;i<artistCount;i++){
            System.out.println("-"+artist[i]);
    }
    System.out.println("Tickets sold in this concert: "+count);
    }

    public void addArtist(String name){
        artist[artistCount]=name;
        artistCount++;
    }

    public void buyTicket(String zone,int qun){
        if (zone.equals("A")) {
            System.out.println("Total Price: "+(500*qun));
            count+=qun;
            TotalTickets+=qun;
        }
        else if (zone.equals("B")) {
            System.out.println("Total Price: "+(1000*qun));
            count+=qun;
            TotalTickets+=qun;
        }
        else{
            System.out.println("Total Price: "+(2000*qun));
            count+=qun;
            TotalTickets+=qun;
        }
    }

    public void buyTicket(String zone){
        if (zone.equals("A")) {
            System.out.println("Total Price: 500");
            count++;
            TotalTickets++;
        }
        else if (zone.equals("B")) {
            System.out.println("Total Price: 1000");
            count++;
            TotalTickets++;
        }
        else{
            System.out.println("Total Price: 2000");
            count++;
            TotalTickets++;
        }
    }

    public void buyTicket(){
        System.out.println("Total Price: 2000");
        count++;
        TotalTickets++;
    }

    public static void showTotalTicketsSold(){
        System.out.println("Total tickets sold (all venues): "+TotalTickets);
    }


}
