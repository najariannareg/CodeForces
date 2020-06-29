import java.util.Scanner;
 
public class Chess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] b = new char[8][8];
		for(int i=0; i<8; i++)
			b[i] = sc.next().toCharArray();
		String s = sc.next();
		int r = 8-(s.charAt(1)-'0');
		int c = s.charAt(0)-'a';
 
		
		//pawn
		if(r<6){
			if(c>0){
				if(b[r+1][c-1]=='p'){
					System.out.println("Sim");
					return;
				}
			}
			if(c<7){
				if(b[r+1][c+1]=='p'){
					System.out.println("Sim");
					return;
				}
			}
		}
		//king
		for(int i=r-1; i<=r+1; i++){
			for(int j=c-1; j<=c+1; j++){
				if(i<0||i>7||j<0||j>7) continue;
				if(b[i][j]=='k'){
					System.out.println("Sim");
					return;
				}
			}
		}
		//knight
		for(int i=-2; i<=2; i++){
			if(i==0) continue;
			int j=3-Math.abs(i);
			if(!(r+i<0||r+i>7||c+j<0||c+j>7)){
				if(b[r+i][c+j]=='c'){
					System.out.println("Sim");
					return;
				}
			}
			if(!(r+i<0||r+i>7||c-j<0||c-j>7)){
				if(b[r+i][c-j]=='c'){
					System.out.println("Sim");
					return;
				}
			}
		}
		//rook, queen
		for(int i=1; r-i>=0; i++){
			char a = b[r-i][c];
			if(a=='.')continue;
			else if(a=='t'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		for(int i=1; r+i<8; i++){
			char a = b[r+i][c];
			if(a=='.')continue;
			else if(a=='t'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		for(int i=1; c-i>=0; i++){
			char a = b[r][c-i];
			if(a=='.')continue;
			else if(a=='t'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		for(int i=1; c+i<8; i++){
			char a = b[r][c+i];
			if(a=='.')continue;
			else if(a=='t'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		//bishop,  queen
		for(int i=1; r-i>=0&&c-i>=0; i++){
			char a = b[r-i][c-i];
			if(a=='.')continue;
			else if(a=='b'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		for(int i=1; r+i<8&&c-i>=0; i++){
			char a = b[r+i][c-i];
			if(a=='.')continue;
			else if(a=='b'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		for(int i=1; r-i>=0&&c+i<8; i++){
			char a = b[r-i][c+i];
			if(a=='.')continue;
			else if(a=='b'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		for(int i=1; r+i<8&&c+i<8; i++){
			char a = b[r+i][c+i];
			if(a=='.')continue;
			else if(a=='b'||a=='r'){
				System.out.println("Sim");
				return;
			}
			else break;
		}
		System.out.println("Nao");
	}
}