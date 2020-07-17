import java.util.Scanner;
public class RectangularGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = n, i, sqrt;
        while(n>1){
            sqrt = (int)Math.sqrt(n);
            for(i=2; i<=sqrt; i++) {
                if (n % i == 0) {
                    n /= i;
                    result += n;
                    break;
                }
            }
            if(i>sqrt) break;
        }
        System.out.println(result+1);
    }
}
