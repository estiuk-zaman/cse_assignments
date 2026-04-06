public class Course {
    public static String name;
    public static String code;
    public static int credit;
    public static void updateDetails(String name,String code,int credit){
        Course.name=name;
        Course.code=code;
        Course.credit=credit;
    }
    public static void displayCourse(){
        System.out.println("Course Name: "+name);
        System.out.println("Course Code: "+ code);
        System.out.println("Course Credit: "+credit);
    }
}
