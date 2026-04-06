public class Employee {
    private String name;
    private int id;
    private String type;
    private boolean isFulltime;

    public Employee(){
        System.out.println("A default employee has been created");
    }
    public Employee(String name,int id,String type){
        this.name=name;
        this.id=id;
        this.type=type;
        if (type.equalsIgnoreCase("Fulltime")) {
            isFulltime=true;
        }
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getID(){
        return this.id;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    public void setIsFulltime(boolean isFulltime){
        this.isFulltime=isFulltime;
    }
    public boolean getIsFulltime(){
        return isFulltime;
    }
}
