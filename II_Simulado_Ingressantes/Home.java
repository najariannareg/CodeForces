import java.util.Scanner;
 
public class Home {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i=0; i<n; i++)
            arr[i] = sc.next().toCharArray();
        int count=0;
        int max=0;
        for(int i=0; i<n;i++){
            for(int j=(i&1)*(m-1); ((i&1)*(m-1)+((i&1)*(-2)+1)*j)<m; j+=(i&1)*(-2)+1){
                char c=arr[i][j];
                    if(c=='.'){
                        count++;
                        if(count>max)
                            max++;
                    }
                    else if(c=='L'){
                        count=0;
                    }
            }
        }
        System.out.println(max);
    }
}