import java.util.Scanner;
 
public class Cirokime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		int r = (int)(Math.log(n) / Math.log(2))+1; 
		
		System.out.println(r);
	}
	
}