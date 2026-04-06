public class Student {
    public int id=0;
    public double cg=0.0;
    public String [] course = new String[4];
    public int course_count=0;

    public Student(int id){
        this.id= id;
        System.out.println("A student with ID "+ id +" has been created");
    }
    public Student(int id,double cg){
        this.id=id;
        this.cg=cg;
        System.out.println("A student with ID "+ id+" and cgpa "+ cg+" has been created");
    }

    public void addCourse(String name){
        if (cg==0) {
            System.out.println("Failed to add "+name+"\n Set CG first");
        }
        else if (cg<3.0) {
            if (course_count<3) {
                course[course_count]=name;
                course_count++;
            }
            else{
                System.out.println("Failed to add "+ name+" \n CG is low.Can't add more than 3 courses.");
            }
        }
        else{
           if (course_count<4) {
            course[course_count]=name;
            course_count++;
           }
           else{
            System.out.println("Failed to add "+ name+"\n Maximum 4 courses allowed");
           } 
        }
    }
    public void addCourse(String [] couStrings){
        int count=0;
        if (cg==0) {
            System.out.println("Failed to add "+couStrings[count]+"\n Set CG first");
        }
         else if (cg<3.0) {
            for(int i =0;i<couStrings.length;i++){
            if (course_count<3) {
                course[course_count]=couStrings[count];
                course_count++;
                count++;
            }
            else{
                System.out.println("Failed to add "+ couStrings[count]+" \n CG is low.Can't add more than 3 courses.");
                count++;
            }
        }
        }
        else{
            for(int i =0;i<couStrings.length;i++){
            if (course_count<4) {
                course[course_count]=couStrings[count];
                course_count++;
                count++;
            }
            else{
                System.out.println("Failed to add "+ couStrings[count]+" \n Maximum 4 courses allowed.");
                count++;
            }
        }
        }
    }

    public void storeCG(double cg){
        this.cg=cg;
    }

    public void removeAllCourse(){
        course_count=0;
    }

    public void showAdvisee(){
        if (course_count==0) {
            System.out.println("No courses added.");
        }
        else{
            System.out.println("Student ID: "+id+", CGPA: "+cg);
            System.out.println("Added courses are:");
            for(int i =0;i<course_count;i++){
                System.out.print(course[i]+" ");
            }
        }
        System.out.println();
    }

    public void storeID(int id){
        this.id=id;
    }
}