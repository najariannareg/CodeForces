import java.util.Scanner;
public class YetAnotherTetrisProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int c = sc.nextInt();
            int h0 = sc.nextInt();
            boolean b = true;
            for(int j=1; j<c; j++){
                int hj = sc.nextInt();
                if((hj&1)!=(h0&1))
                    b = false;
            }
            if(b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
