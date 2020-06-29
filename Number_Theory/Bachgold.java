import java.util.Scanner;
 
public class Bachgold {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    int d = n/2;
    int m = n&1;
 
    System.out.println(d);
    for(int i=0; i<d-1; i++)
      System.out.print("2 ");
    System.out.println(2+m);
	}
}