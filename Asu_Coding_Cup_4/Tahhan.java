import java.util.Scanner;
 
public class Tahhan {
	public static void main(String[] args) {
		tahhan();
	}
	
	public static void tahhan() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String direction = sc.next();
		char c;
		for(int i = 0; i < direction.length(); i++) {
			c = direction.charAt(i);
			if(c == 'U') y++;
			else if(c == 'D') y--;
			else if(c == 'L') x--;
			else if(c == 'R') x++;
		}
		System.out.println(x + " " + y);
	}
}