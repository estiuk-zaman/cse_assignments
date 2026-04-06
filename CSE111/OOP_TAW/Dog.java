public class Dog {
    public String name;

    public void bark(){
        System.out.println(name+" is barking.");
    }

    public void eat (String fd){
        System.out.println(name+" is eating "+fd);
    }
    public void eat (String fd,int qn){
        System.out.println(name+" is eating "+qn+fd);
    }
    public void eat (String fd,int qn,String fd_01){
        System.out.println(name+" is eating "+qn+fd);
    }
}
