public class Assignment {
    public static int tasks = 0;
    public static String difficulty;
    public static Boolean submission=false;
    public static Boolean isOptional = false;;

    public static void printDetails(){
        System.out.println("Number of tasks: "+ tasks);
        System.out.println("Difficulty level: "+ difficulty);
        System.out.println("Submission required: "+ submission);
    }
    public static String makeOptional(){
        if (!isOptional) {
            String reString = "Assignment will not require submission";
        submission=false;
        isOptional= true;
        return reString;
        }
        else{
            String reString = "Submission is already not required";
            return reString;
        }

    }
}
