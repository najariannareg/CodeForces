import java.util.Scanner;
 
public class BankAccount {
	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String a = sc.next();
    		if(a.charAt(0)=='-'){
        		char b = a.charAt(a.length()-1);
        		char c = a.charAt(a.length()-2);
        		if(b>c) a = a.substring(0, a.length()-1);
        		else a = a.substring(0, a.length()-2) + b;  
    		}
    		if(Integer.parseInt(a) == 0)System.out.println(0); 
    		else System.out.println(a);
	}
}