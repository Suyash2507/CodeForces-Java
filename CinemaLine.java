import java.util.*;//122A
public class CinemaLine {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		ArrayList<String> ar=new ArrayList<String>();
		boolean flag=true;int bal=0;int p=0,q=0;
		while(n>0) {
			int a=S.nextInt();
			if(a==25)
				p++;
			else if(a==50) {
				if(p>=1) {
					q++;
					p--;
				}
				else {
					flag=false;
					break;
				}
			}
			else if(a==100) {
				if(p>=1 && q>=1) {
					p--;
					q--;
				}
				else if(p>=3) {
					p=p-3;
				}
				else {
					flag=false;
					break;
				}
			}
			n--;
		}
		if(flag) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
