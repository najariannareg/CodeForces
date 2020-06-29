import java.util.Scanner;

public class Karaoke {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 1;
		char c = s.charAt(0);
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i) == c) count++;
			else {
				System.out.print(c+""+count);
				c = s.charAt(i);
				count = 1;
			}
		}
		System.out.print(c+""+count);
	}
}