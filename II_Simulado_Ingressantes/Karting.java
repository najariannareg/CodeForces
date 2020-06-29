import java.util.Scanner;

public class Karting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;
		int h=-1;
		int index=-1;
		for(int i=0; i<n; i++) {
			h = sc.nextInt();
			if(max1<=h) {
				max2=max1;
				max1=h;
				index=i;
			}
		}
		if(max1==max2) System.out.println(-1);
		else System.out.println(index+1);
	}
}