import java.util.Scanner;
public class RelativelyPrimePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong(), r = sc.nextLong();
        System.out.println("YES");
        while(l<r)
            System.out.println(l++ + " " + l++);
    }
}
