import java.util.Scanner;
 
public class BasharAndTheBadLandEasy {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		System.out.println(bashar(arr, x));
	}
	
	
	public static int bashar(int[] arr, int x) {
		int min = Integer.MAX_VALUE;
		int i = 0, j = 0, sum = 0;
		while(j < arr.length) {
			if(sum < x) sum += arr[j++];
			else if(sum >= x) {
				min = Math.min(min, j-i);
				sum -= arr[i++];
			}
		}
		if(sum < x && min == Integer.MAX_VALUE) return -1;
		else return Math.min(min, j-i);
	}
	
}