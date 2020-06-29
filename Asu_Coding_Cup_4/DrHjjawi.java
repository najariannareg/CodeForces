import java.util.Scanner;
 
public class DrHjjawi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        print(s);
    }
    
    public static void print(String s){
        int[] bucket = new int[5];
        for(int i=0; i<s.length(); i++)
            bucket[s.charAt(i)-'a']++;
        int min=bucket[0], max=bucket[0];
        for(int i=1; i<bucket.length; i++){
            if(min>bucket[i]) min=bucket[i];
            if(max<bucket[i]) max=bucket[i];
        }
        System.out.println(min+" "+max);
    }
    
}