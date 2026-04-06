import java.util.Scanner;

public class Home_Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);
            if (ch == 'a') {
                System.out.print('z');
            } else {
                System.out.print((char)(ch - 1));
            }
        }
        sc.close();
    }
}
