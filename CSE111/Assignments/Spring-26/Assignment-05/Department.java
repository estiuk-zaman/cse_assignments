public class Department {
    public String name;
    public Student [] arr = new Student[5];
    public int count;

    public Department(String name){
        this.name=name;
    }

    // ✅ সঠিক
public void findStudent(int id){
    for(int i = 0; i < count; i++){
        if (arr[i].id == id) {
            System.out.println("Student info:\nStudent Name: " + arr[i].name + "\nID: " + arr[i].id + "\nCGPA:  " + arr[i].cgpa);
            return; // পেয়ে গেছি, বের হয়ে যাও
        }
    }
    // loop শেষ হলেও না পেলে তখন print করো
    System.out.println("Student with this ID doesn't exist, Please give a valid ID");
}

    // ✅ সঠিক
public void addStudent(Student obj){
    if (count >= 5) return;

    // আগে পুরো array check করো
    for(int i = 0; i < count; i++){
        if (arr[i].id == obj.id) {
            System.out.println("Student with the same ID already exists, Please try with another ID");
            return; // duplicate পেলে বের হয়ে যাও
        }
    }
    // loop শেষে কোনো duplicate না পেলে তখন add করো
    arr[count] = obj;
    count++;
    System.out.println("Welcome to " + name + " department, " + obj.name);
}

    public void addStudent(Student obj1,Student obj2,Student obj3){
        addStudent(obj1);
        addStudent(obj2);
        addStudent(obj3);
    }

    public void details(){
        System.out.println("Department Name: " + name);
        System.out.println("Number of student:" + count);
        System.out.println("Details of the students:");
        for (int i = 0; i < count; i++) {
            System.out.println("Student name: " + arr[i].name
                    + ", ID: " + arr[i].id
                    + ", cgpa: " + arr[i].cgpa);
        }
    }

}
