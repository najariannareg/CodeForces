import java.util.Scanner;
public class NumbersColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), a, b, min, i;
        for(int j=0; j<t; j++){
            a = sc.nextInt();
            b = sc.nextInt();
            min = Integer.min(a, b);
            for(i=2; i<=min; i++)
                if(a%i==0 && b%i==0)
                    break;
            System.out.println(i<=min?"Infinite":"Finite");
        }
    }
}
