import java.util.ArrayList;
import java.util.Scanner;
public class NoldbachProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort(), k = sc.nextShort(), count = 0;
        ArrayList<Short> al = new ArrayList<>();
        for(short i=5; i<=n; i+=2)
            if(isPrime(i)) al.add(i);
        Short[] arr = new Short[al.size()];
        arr = al.toArray(arr);
        for(short i=0; i<arr.length-1; i++)
            if(binarySearch(arr, (short)(arr[i]+arr[i+1]+1))) count++;
        System.out.println(k<=count?"Yes":"No");
    }
    private static boolean isPrime(short i){
        //if(i%2==0) return false;
        for(short j=3; j<=Math.sqrt(i); j+=2)
            if(i%j==0) return false;
        return true;
    }
    private static boolean binarySearch(Short[] arr, Short num){ ;
        int start=0, end=arr.length-1, mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid].equals(num)) return true;
            else if(arr[mid]<num) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
}
