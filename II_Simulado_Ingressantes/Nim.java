import java.util.Scanner;
 
public class Nim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while(x>0 || y>0){
			int diff = x-y;
			if(diff>0) {
				System.out.println(1+" "+diff);
				x-=diff;
			}else {
				System.out.println(2+" "+(-diff));
				y+=diff;
			}
			
			System.out.flush();
			if(x==0&&y==0)break;
			int u = sc.nextInt();
			int v = sc.nextInt();
			if(u==1) x-=v;
			else y-=v;
			
		}
	}
}