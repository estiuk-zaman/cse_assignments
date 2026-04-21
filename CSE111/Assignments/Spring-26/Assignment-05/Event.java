public class Event {
    private String name;
    public String date;
    public static Event [] allEvents= new Event[5];
    public static int count;

    public Event(String name,String date){
        this.name=name;
        this.date=date;
        allEvents[count]=this;
        count++;
    }

    public static void allEventInfo(){
        System.out.println("Total Events: "+count);
        System.out.println("Event Details:");
        for(int i=0;i<count;i++){
            System.out.println("Event "+(i+1)+":");
            System.out.println("Name: "+allEvents[i].name);
            System.out.println("Date: "+allEvents[i].date);
        }
    }

    public String details(){
        return ("Name: "+this.name+"\nDate: "+this.date);
    }

    public String getName(){
        return this.name;
    }
}
