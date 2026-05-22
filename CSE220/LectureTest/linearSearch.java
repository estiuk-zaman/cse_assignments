public class linearSearch {

    public static void main(String[] args) {
        int [] arr = {11,17,18,45,50,71,95};
        int target = 50;

        // for (int i =0;i<arr.length;i++){
        //     if (arr[i]==target) {
        //         System.out.println("Index: "+i);
        //     }
        // }    runtime=86ms

        int m =0;
        int n = arr.length-1;
        while (m<=n) {
            int l = (m+n)/2;
            if (arr[l]==target) {
                System.out.println(l);
                break;
            }
            else{
                if (arr[l]>target) {
                    n=l-1;
                }
                else{
                    m=l+1;
                }
            }
        }

        //runtime = 85ms (lol)
    }
}