
public class Organizer {
    public String name;
    public Event [] myEvents=new Event[4];
    public int count;

    public Organizer(){
        System.out.println("Please provide the organizer's name");
    }
    public Organizer(String name){
        this.name=name;
    }

    public void organizeEvent(Event obj){
        if (count<4) {
        myEvents[count]=obj;
        count++;
        System.out.println(this.name+" successfully organized "+obj.getName());
        }
    }

    public void searchEventByDate(String date){
        boolean isFound=false;
        for(int i =0;i<count;i++){
            if (date.equals(myEvents[i].date)) {
                System.out.println(myEvents[i].getName());
                isFound=true;
            }
        }
        if (!isFound) {
            System.out.println("No event is scheduled for "+date);
        }
    }



}
