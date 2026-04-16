public class Student {

    public static int total_students;
    public static double total_marks;;
    public String name;
    private double tracing_marks;
    private double coding_marks;
    public int ID;

    public Student(String name){
        this.name=name;
        total_students++;
        ID=total_students;
    }
    public Student(String name,double coding_marks,double tracing_marks){
        this.name=name;
        this.tracing_marks=tracing_marks;
        this.coding_marks=coding_marks;
        total_marks+=coding_marks;
        total_marks+=tracing_marks;
        total_students++;
        ID=total_students;
    }

    public static double averageMarks(){
        if (total_students==0) {
            return 0.0;
        }
        else{
        return total_marks/total_students;
        }
    }

    public void setCodingMarks(double marks){
        this.coding_marks=marks;
        total_marks+=marks;
    }
    public double getCodingMarks(){
        return coding_marks;
    } 
    public void setTracingMarks(double marks){
        this.tracing_marks=marks;
        total_marks+=marks;
    }
    public double getTracingMarks(){
        return tracing_marks;
    }

    public void individualDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Coding Marks: "+getCodingMarks());
        System.out.println("Tracing Marks: "+getTracingMarks());
        if ((coding_marks+tracing_marks)>50) {
            System.out.println(name+" has passed with "+(coding_marks+tracing_marks));
        }
        else{
            System.out.println(name+" has failed with "+(coding_marks+tracing_marks));
        }
    }
}