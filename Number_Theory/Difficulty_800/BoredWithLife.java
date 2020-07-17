import java.util.Scanner;
 
public class BoredWithLife {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = Math.min(a,b);
    for(int i=m-1; i>0; i--){
      m*=i;
    }
    System.out.println(m);
	}
}