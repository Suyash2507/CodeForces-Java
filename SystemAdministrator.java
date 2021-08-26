import java.util.*;
public class SystemAdministrator {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		int Alive=0,Blive=0;
		int totA=0,totB=0;
		for(int i=0;i<n;i++) {
			int t=S.nextInt();
			int x=S.nextInt();
			int y=S.nextInt();
			if(t==1) {
				Alive=Alive+x;
				totA=totA+x+y;
			}
			else {
				Blive=Blive+x;
				totB=totB+x+y;
			}
		}
		if(Alive>=(totA/2)) {
			System.out.println("LIVE");
		}else {
			System.out.println("DEAD");
		}
		if(Blive>=(totB/2)) {
			System.out.println("LIVE");
		}else {
			System.out.println("DEAD");
		}
	}
}