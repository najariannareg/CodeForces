import java.util.Scanner;
public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
            binaryRepresentationIt(sc.nextInt());
    }

    public static void binaryRepresentationRec1(int num){
        if(num==0)
            return;
        binaryRepresentationRec1(num>>1);
        System.out.print(num&1);
    }
    public static void binaryRepresentationRec(int num){
        binaryRepresentationRec1(num);
        System.out.println();
    }

    public static String binaryRepresentationIt(int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num&1);
            num>>=1;
        }
        sb.reverse();
        System.out.println(sb);
        return sb.toString();
    }
}
