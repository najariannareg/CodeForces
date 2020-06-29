import java.util.Scanner;
 
 
public class Movies {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] floor = new int[n];
        int[] foot = new int[n];
        int[] chain = new int[n];
        for(int i=0; i<n; i++)
            floor[i] = sc.nextInt();
        for(int i=0; i<n; i++)
            foot[i] = sc.nextInt();
        for(int i=0; i<n; i++)
            chain[i] = sc.nextInt();
        long ff=0;
        long fc=0;
        for(int i=0; i<n; i++){
            ff+=(floor[i]-foot[i])*(floor[i]-foot[i]);
            fc+=(floor[i]-chain[i])*(floor[i]-chain[i]);
        }
        if(ff<=fc) System.out.println("Yan");
        else System.out.println("MaratonIME");
    }
}