import java.util.Scanner;
public class Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n+1];
        for(int i=1; i<=n; i++)
            arr[i] = sc.nextLong();
        for(int i=2; i<=n; i++)
            arr[i] += arr[i-1];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (((arr[b] - arr[a-1]) & 1) == 0) System.out.println("Sim");
            else System.out.println("Nao");
        }
    }
 
}