import java.util.Scanner;
public class MultTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int count = 0;

//        long start = System.nanoTime();
        for(int i=1; i<=x && i<=n; i++){
            if(x%i==0 && x/i<=n){
                count++;
            }
        }
//        long end = System.nanoTime();
//        System.out.println(end-start);

        System.out.println(count);
    }
}
