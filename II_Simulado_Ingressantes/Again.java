import java.util.Scanner;
 
public class Again {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		for(int i=0; i<n; i++)
			for(int j=0; j<3; j++)
				arr[i][j] = sc.nextInt();
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				int d2 = (arr[j][0]-arr[i][0])*(arr[j][0]-arr[i][0])+(arr[j][1]-arr[i][1])*(arr[j][1]-arr[i][1]);
				int r2 = (arr[i][2]+arr[j][2])*(arr[i][2]+arr[j][2]);
				if(d2==r2) System.out.println((i+1)+" "+(j+1));
			}
		}
	}
}