public class Teacher {
    public String name="";
    public String initial="";
    public Course [] courses = new Course[3];
    public int count=0;

    public Teacher(String name,String initial){
        this.name=name;
        this.initial=initial;
        System.out.println("A new teacher has been created");
    }

    public void addCourse(Course obj){
        courses[count]=obj;
        count++;
    }

    public void printDetail(){
        System.out.println("Name: "+name);
        System.out.println("Initial: "+initial);
        System.out.println("List of courses:");
        for(int i=0;i<count;i++){
            System.out.println(courses[i].name);
        }
    }
}
