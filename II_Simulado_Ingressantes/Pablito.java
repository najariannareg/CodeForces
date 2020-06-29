import java.util.Scanner;
 
public class Pablito {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) 
			print(sc.nextLong(), sc.nextLong());
	}
	
	public static void print(long a, long b) {
		if(gcd(a, b) > 1)
			System.out.println("Sim");
		else
			System.out.println("Nao");
		
	}
	
	public static long gcd(long a, long b) {
		long c;
		while(b>0) {
			c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
}