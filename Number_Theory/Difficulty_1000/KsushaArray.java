import java.util.Scanner;
public class KsushaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<min)
                min = arr[i];
        }
        boolean bool = true;
        for(int i: arr) {
            if (i % min != 0) {
                bool = false;
                break;
            }
        }
        System.out.println(bool?min:-1);
    }
}
