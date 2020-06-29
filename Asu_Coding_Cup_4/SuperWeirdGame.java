import java.util.Scanner;
 
public class SuperWeirdGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] mahmoud = new int[n];
        for(int i=0; i<n; i++)
            mahmoud[i] = sc.nextInt();
        int[] bashar = new int[n];
        for(int i=0; i<n; i++)
            bashar[i] = sc.nextInt();
        print(mahmoud, bashar, k);
    }
    
    public static void print(int[] m, int[] b, int k){
        int numM = 0, numB = 0;
        int[] bucketM = new int[100000+1];
        int[] bucketB = new int[100000+1];
        for(int i=0; i<m.length; i++)
            bucketM[m[i]]++;
        for(int i=0; i<b.length; i++)
            bucketB[b[i]]++;
        for(int i=1; i<bucketM.length && i<k-i; i++){
            numM += bucketM[i]*bucketM[k-i];
        }
        for(int i=1; i<bucketB.length && i<k-i; i++){
            numB += bucketB[i]*bucketB[k-i];
        }
        if(numM > numB)
            System.out.println("Mahmoud");
        else if(numM < numB)
            System.out.println("Bashar");
        else
            System.out.println("Draw");
    }
    
}