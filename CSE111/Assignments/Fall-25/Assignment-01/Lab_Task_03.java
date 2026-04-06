
import java.util.Arrays;
import java.util.Scanner;

public class Lab_Task_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int n = sc.nextInt();
        Double [] array=new Double[n];
        int New =0;
        System.out.println("Please enter the elements of the array: ");
        for(int i=0;i<n;i++){
         array[i] = sc.nextDouble();
        }
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if (array[i]!=array[j]) {
                    break;
                }
                else{
                    array[j]=0.0;
                }
            }
        }
        for(int i =0;i<n;i++){
            if (array[i]!=0.0) {
                New++;
            }
        }
        int index=0;
        Double [] newArr=new Double[New];
        for(int i =0;i<array.length;i++){
            if (array[i]!=0.0) {
                newArr[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println("Removed Elements: "+ (n-New));
        sc.close();
    }
}