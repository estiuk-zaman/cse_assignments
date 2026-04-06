public class CellPhone {
    public static String model="unknown";
    public static int stored = 0;
    public static String con1=""; 
    public static String con2=""; 
    public static String con3=""; 
    public static int count=0;

    public static void storeContact(String cont){
        count++;
        stored++;
        if (con1.length()==0) {
            con1=cont;
        }
        else if (con2.length()==0) {
            con2=cont;
        }
        else if (con3.length()==0){
            con3=cont;
        }
        if (count>3) {
            System.out.println("Memory full. New contact can't be stored.");
            stored=3;
        }
        else{
            System.out.println("Contact Stored");
        }
    }

    public static void printDetails(){
        System.err.println("Phone Model "+model);
        System.out.println("Contacts Stored "+stored);
        if (con1.length()!=0) {
            System.out.println("Stored Contracts:");
            System.out.println(con1);
        System.out.println(con2);
        System.out.println(con3);
        }
        
    }
}
