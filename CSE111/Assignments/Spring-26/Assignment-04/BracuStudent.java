public class BracuStudent {
    public String name;
    private String location;
    public boolean pass=false;

    public BracuStudent(String name,String location){
        this.name=name;
        this.location=location;
    }
    public void showDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Lives in "+location);
        System.out.println("Have bus pass? "+pass);
    }

    public void collectPass(){
        pass=true;
    }

    public void setLocation(String newLocation){
        location=newLocation;
    }

    public String getLocation(){
        return location;
    }
}
