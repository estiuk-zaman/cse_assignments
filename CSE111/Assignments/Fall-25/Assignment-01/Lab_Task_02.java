import java.util.Scanner;

public class Lab_Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_String=sc.nextLine();
        String second_String=sc.nextLine();
        String combString="";
        int sum = 0;
        combString=first_String+second_String;
        System.out.println(combString);
        for(int i =0;i<combString.length();i++){
            char ch =combString.charAt(i);
            if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
                sum+=(int)(ch);
            }
        }
        System.out.println(sum);
        sc.close();
    }
}