import java.util.Scanner;
 
public class MahmoudAndTheFlagstones {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        print(arr);
    }
    
    public static void print(int[] arr){
        int value = 0;
        int[] bucket = new int[100000+1];
        for(int i=0; i<arr.length; i++)
            bucket[arr[i]]++;
        for(int i=1; i<bucket.length; i++){
            value = (value+power(bucket[i]))%(1000000000+7);
        }
        System.out.println(value);
    }
    
    public static int power(int pow){
        int value = 1;
        for(int i=0; i<pow; i++)
            value = (2*value)%(1000000000+7);
        return value-1;
    }
    
}