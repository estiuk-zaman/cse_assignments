import java.util.Arrays;
import java.util.Scanner;

public class Lab_Task_03_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        Double [] arr = new Double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        Double [] newArr = new Double[n];
        newArr[0]=arr[0];
        int New=1;
        for(int i=1;i<n;i++){
            if (arr[i]!=arr[i-1]) {
                newArr[New]=arr[i];
                New++;
            }
        }
        Double [] Final_arr=new Double[New];
        for(int i =0;i<New;i++){
            Final_arr[i]=newArr[i];
        }
        System.out.println(Arrays.toString(Final_arr));
        System.out.println("Removed elements: "+ (n-New));
        sc.close();
    }
}