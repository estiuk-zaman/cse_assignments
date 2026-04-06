public class Student {
    public String name;
    public int id;
    public Course [] courses = new Course[5];
    public int courseCount=0;

    public Student(String nam,int i){
        name=nam;
        id=i;
    }
    public void addCourse (Course nm){
        if (courseCount<5) {
        courses[courseCount]=nm;
        courseCount++;
        }
        else{
            System.out.println("Jayga nai");
        }
    }

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+ id);
        System.out.println("Course taken:");
        for(int i=0;i<courseCount;i++){
            System.out.println(courses[i].code);
            System.out.println(courses[i].title);
        }
    }
}