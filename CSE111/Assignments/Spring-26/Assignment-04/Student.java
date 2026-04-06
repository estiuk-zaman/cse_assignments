public class Student {
     public String email;
     private String password;
     private boolean login;
     public String name,dept;
     public int id;
     public String [] courses = new String[3];
     public int count;
     
     public Student(String name,int id,String dept){
        this.name=name;
        this.id=id;
        this.dept=dept;
        System.out.println("Student obj is created");
     }
     
     public void setPassword(String pass){
        this.password=pass;
     }
     public String getPassword(){
        return password;
     }

     public void setLogin(){
        login=true;
     }
     public boolean getLogin(){
        return login;
     }
}
