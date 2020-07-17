import java.util.Scanner;
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1, d=1;
        while(n>0) {
            n = sc.nextShort();
            d = String.valueOf(n).length();
            //int length = (int)(Math.log10(n)+1);
            //ch(n, d);
            check(n, d);
            n=0;
        }
    }
    public static boolean combinations(int n, int d, StringBuilder sb, int i){
        if(i==d){
            int k = Integer.parseInt(sb.toString());
            return n % k == 0;
        }
        return combinations(n, d, sb.replace(i,i+1,"4"), i+1) ||
                combinations(n, d, sb.replace(i,i+1,"7"), i+1);
    }
    public static void check(int n, int d){
        boolean answer = false;
        for(int j=1; j<=d; j++){
            if(combinations(n, j, new StringBuilder(), 0) == true){
                answer = true;
                break;
            }
        }
        System.out.println(answer? "YES" : "NO");
    }

//    public static void comb(int d, StringBuilder sb, int i){
//        if(i==d){
//            System.out.println(sb.toString());
//            return;
//        }
//        comb(d, sb.replace(i,i+1,"4"), i+1);
//        comb(d, sb.replace(i,i+1,"7"), i+1);
//    }
//    public static void ch(int n, int d){
//        for(int j=1; j<=d; j++)
//            comb(j, new StringBuilder(), 0);
//    }
}
