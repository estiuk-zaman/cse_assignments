import java.util.Scanner;
import java.util.Arrays;

public class Ungraded_Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ✅ Sort the array properly
        Arrays.sort(arr);

        double median;
        if (n % 2 == 0) {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            median = (arr[mid1] + arr[mid2]) / 2.0;
        } else {
            median = arr[n / 2];
        }

        System.out.println("The median is " + median);
        sc.close();
    }
}
