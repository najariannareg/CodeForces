import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        System.out.println(m + " + " + n + " = " + bitwiseAdd(m,n));
        System.out.println(m + " * " + n + " = " + bitwiseMultiply(m,n));
    }
    public static int bitwiseMultiply(int m, int n){
        int a=m, b=n, result=0;
        while(b!=0){
            if((b&1)==1)
                result+=a;
            a<<=1;
            b>>>=1;
        }
        return result;
    }
    public static int bitwiseAdd(int m, int n){
        int a=m, b=n;
        int and, xor, temp;
        xor = a^b;
        and = a&b;
        while(and!=0){
            and<<=1;
            temp = and&xor;
            xor ^= and;
            and = temp;
        }
        return xor;
    }
}
