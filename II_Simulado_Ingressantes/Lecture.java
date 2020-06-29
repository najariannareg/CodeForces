import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        result(n, m, k);
    }
    public static void result(int n, int m, int k) {
        int max = n-m+k;
        if(10*max < 7*n) System.out.println(-1);
        else if(10*k >= 7*n) System.out.println(0);
        else System.out.println(((7*n+9)/10)-k);
 
        System.out.println(max*100/n);
    }
}