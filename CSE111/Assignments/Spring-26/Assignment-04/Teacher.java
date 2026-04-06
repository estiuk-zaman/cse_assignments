public class Teacher {
    public String name,initial;
    public Course [] course_name = new Course[3];
    public int count=0;

    public Teacher(String name,String initial){
        this.name=name;
        this.initial=initial;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course obj){
        if (count<3) {
            course_name[count]=obj;
            count++;
        }
    }
    public void printDetail(){
        System.out.println("Name: "+name);
        System.out.println("Initial: "+initial);
        System.out.println("List of courses:");
        for(int i=0;i<count;i++){
            System.out.println(course_name[i].name);
        }
    }
}
