import java.util.Arrays;
import java.util.Scanner;

public class Ungraded_Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Target: ");
                int target = sc.nextInt();
        int [] newArr = new int[n-1];
        int index=0;
        for(int i=0;i<n;i++){
            if (arr[i]!=target) {
                newArr[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        sc.close();
    }    
}
