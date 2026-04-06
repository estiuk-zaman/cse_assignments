import java.util.Scanner;
public class Lab_Task_01{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int max =0;
        int min =0;
        int count=0;
        Boolean found = false;
        Boolean found01=false;
        for(int i =0;i<10;i++){
            int a = sc.nextInt();
            if (a>0 && a%2!=0) {
                sum+=a;
                count++;
            if (a>max) {
                max=a;
            }
            if (!found) {
                min=a;
                found=true;
            }
            if (a<min) {
                min=a;
            }
            found01=true;
        }
            
        }
        if (found01) {
            double average = (double)sum/count;
        System.out.println("Sum: "+sum);
        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: "+ min);
        System.out.println("Average: "+ average);
        }
        else{
            System.out.println("No odd positive numbers found");
        }
        sc.close();
    }
}