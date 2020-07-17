import java.util.Scanner;
public class PrimeSubtraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            if(x-y>1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
