import java.util.Scanner;

public class Home_Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean [] isVisited = new boolean[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if (!isVisited[i]) {
                int count = 1;
                for(int j=i+1;j<n;j++){
                    if (arr[i]==arr[j]) {
                        count++;
                        isVisited[j]=true;
                    }
                }
                isVisited[i] = true;
                System.out.println(arr[i]+" - "+count+" times");
            }
        }
        sc.close();
    }
}
