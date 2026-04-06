public class Constractor_student {
    public String name;
    public int id;
    public Double cgpa;

    public Constractor_student(){

    }
    public Constractor_student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public Constractor_student(String name,int id,Double cgpa){
    this.name=name;
    this.id=id;
    this.cgpa=cgpa;
    }
    public void details(){
        System.out.println("Name: "+name+"\n"+"ID: "+id+"\n"+ "CGPA: "+cgpa);
    }
}
