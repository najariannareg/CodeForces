import java.util.Scanner;
public class DigitalRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        for(short i=0; i<n; i++)
            System.out.println((sc.nextLong()-1)*9+sc.nextByte());
    }
}
