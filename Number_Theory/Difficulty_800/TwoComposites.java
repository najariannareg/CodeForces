import java.util.Scanner;

public class TwoComposites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num&1) == 0)
            System.out.println("4 " + (num-4));
        else
            System.out.println("9 " + (num-9));
    }
}
