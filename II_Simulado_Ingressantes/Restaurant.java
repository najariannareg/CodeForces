import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++)
			arr[i] = sc.nextInt();
		int yan=0, nat=0, i=0, j=0;
		while(i<n && yan<t)
			yan += arr[i++];
		while(j<n && nat<t)
			nat += arr[n-1-j++];
 
		if(i-j>0) System.out.println("Yan");
		else if(i-j<0) System.out.println("Nathan");
		else System.out.println("Empate");
	}
}