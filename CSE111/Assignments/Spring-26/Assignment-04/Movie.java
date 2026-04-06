public class Movie {
    public String name,catagory,duration;

    public Movie(String name,String catagory,String duration){
        this.name=name;
        this.catagory=catagory;
        this.duration=duration;
    }
    public Movie(String name,String catagory){
        this.name=name;
        this.catagory=catagory;
        this.duration="Unknown";
    }
}
