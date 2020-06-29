import java.util.Scanner;
 
public class WeirdGame {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n&1) == 1) System.out.println("Bashar");
		else System.out.println("Mahmoud");
	}
	
}