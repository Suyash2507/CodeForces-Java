import java.util.*;//118B
public class PresentFromLema {
	public static void main(String[] args) {//Maze aagye isko karne m
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int i,j,k,l,m,p,q,r,s;
		for(i=n;i>=0;i--) {
			for(j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(k=0;k<=n-i;k++) {
				if(k!=0) {
					System.out.print(k+" ");
				}else if(k==0 && i==n) {
					System.out.print(k);
				}
				else {
					System.out.print(k+" ");
				}
			}
			for(m=n-1-i;m>=0;m--) {
				if(m!=0) {
					System.out.print(m+" ");
				}else {
					System.out.print(m);
				}
			}
			for(l=0;l>i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(p=n-1;p>=0;p--) {
			for(q=n-p;q>0;q--) {
				System.out.print("  ");
			}
			for(r=0;r<=p;r++) {
				if(r==0 && p==0) {
					System.out.print(r);
				}else {
					System.out.print(r+" ");
				}
			}
			for(s=p-1;s>=0;s--) {
				if(s!=0) {
					System.out.print(s+" ");
				}
				else {
					System.out.print(s);
				}
			}
			System.out.println();
		}
	}
}
