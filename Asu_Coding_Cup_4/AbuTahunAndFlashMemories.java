import java.util.Scanner;
 
public class AbuTahunAndFlashMemories {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a = sc.nextInt();
		print(n, x, a);
	}
	
	public static void print(int n, int x, int a) {
		int num = 0;
		while(n>0) {
			num++;
			n -= a/x;
		}
		System.out.println(num);
	}
		
}