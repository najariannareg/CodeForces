import java.util.Scanner;
import java.util.Stack;
 
public class Rowing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Stack<Character> t = new Stack();
        int i=0;
        for(; i<S.length(); i++){
            char c = S.charAt(i);
            if(c == 'A') t.push('A');
            else if(c == 'B' && !t.empty()) t.pop();
            else break;
        }
        if(i==S.length() && t.empty()) System.out.println("Sim");
        else System.out.println("Nao");
    }
}