public class Connect {
    public int totalAdvisee;
    public Student [] advisee = new Student[5];
    int count=0;

    public Connect(){
        System.out.println("Connect is ready to use!");
    }

    public void login(Student obj){
        if (obj.email!=null && obj.getPassword()!=null) {
            obj.setLogin();
            System.out.println("Login successful");
        }
        else{
            System.out.println("Email and password need to be set.");
        }
    }

    public void advising(Student obj){
        if (obj.getLogin()) {
            if (obj.count!=0) {
                System.out.println("Advising successful!");
                advisee[count]=obj;
                count++;
                totalAdvisee=count;
            }
            else{
                System.out.println("You haven't selected any courses.");
            }
        }
        else{
            System.out.println("Please login to advise courses!");
        }
    }

    public void advising(Student obj,String c1,String c2,String c3,String c4){
        System.out.println("You need special approval to take more than 3 courses.");
    }

    public void advising(Student obj,String c1,String c2,String c3){
        if(!obj.getLogin()){
            System.out.println("Please login to advise courses!");
            return;
        }
        System.out.println("Advising successful!");
        obj.courses[obj.count]=c1;
        obj.count++;
        obj.courses[obj.count]=c2;
        obj.count++;
        obj.courses[obj.count]=c3;
        obj.count++;
        advisee[count]=obj;
        count++;
        totalAdvisee=count;
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+count);
        for(int i=0;i<count;i++){
            System.out.print("Name: "+advisee[i].name+" ");
            System.out.println("ID: "+advisee[i].id);
            System.out.println("Department: "+advisee[i].dept);
            System.out.println("Advised Courses:");
            for(int j=0;j<advisee[i].count;j++){
                System.out.print(advisee[i].courses[j]+" ");
            }
            System.out.println();
            System.out.println("==============");
        }
    }
}