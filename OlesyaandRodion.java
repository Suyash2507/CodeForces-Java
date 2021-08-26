import java.util.*;
public class OlesyaandRodion {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();int k=n;
		int t=S.nextInt();String l="";
		while(k>0) {
			if(k==n) {
				l=l.concat("1");
			}else {
				l=l.concat("0");
			}
			k--;
		}
		int z=Integer.parseInt(l);
		if(n!=1) {
			while(true) {
				if(z%t==0) {
					System.out.println(l);
					break;
				}
				z++;
			}
		}else{
			System.out.print(t);	
		}
		
	}
}
