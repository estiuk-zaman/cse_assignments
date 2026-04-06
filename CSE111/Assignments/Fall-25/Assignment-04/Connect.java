public class Connect {
     public boolean islogin;
     public int totalAdvisee=0,courseCount=0;
     public Student_01 [] arr = new Student_01[5];
     public String [] courses= new String[3];

    public Connect(){
        System.out.println("Connect is ready to use!");
    }

    public void login(Student_01 obj){
        if (obj.email != null && obj.password !=null) {
            System.out.println("Login Successful");
            islogin=true;
        }
        else{
            System.out.println("Email and password need to be set");
        }
    }

    public void advising(Student_01 obj){
        if (islogin) {
            if (courseCount==0) {
                System.out.println("You haven't selected any courses.");
            }
            else if (courseCount<=3){
                arr[totalAdvisee]=obj;
                System.out.println("Advising successful!");
                totalAdvisee++;
            }
            else{
                System.out.println("You need special approval to take more than 3 courses.");
            }
        }
        else{
            System.out.println("Please login to advise courses!");
        }
    }
    public void advising(Student_01 obj,String c1,String c2,String c3,String c4){
         if (islogin) {
                 System.out.println("You need special approval to take more than 3 courses.");
        }
        else{
            System.out.println("Please login to advise courses!");
        }
    }
    public void advising(Student_01 obj,String c1,String c2,String c3){
        if (islogin) {
            arr[totalAdvisee]=obj;
            courses[courseCount]=c1;
            courseCount++;
            courses[courseCount]=c2;
            courseCount++;
            courses[courseCount]=c3;
            System.out.println("Advising Successful");
            totalAdvisee++;
            courseCount=0;
        }
        else{
            System.out.println("Please login to advise courses.");
        }
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+totalAdvisee);
        for(int i =0;i<totalAdvisee;i++){
        System.out.println("Name: "+ arr[i].name+"  ID: "+arr[i].id);
        System.out.println("Department: "+ arr[i].dept);
            System.out.println("Advised courses: ");
            for(int j =0;j<=2;j++){
                System.out.print(courses[j]+" ");
            }
            System.out.println();
            System.out.println("============");
        }
    }

}
