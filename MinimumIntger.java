import java.util.*;//798A
public class MinimumIntger {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		while(n>0) {
			int l=S.nextInt();
			int r=S.nextInt();
			int d=S.nextInt();
			int flag=0,v=0;
			for(int i=1;i<l;i++) {
				if(i%d==0) {
					flag=1;
					v=i;
					break;
				}
			}
			if(flag==1) {
				System.out.println(v);
			}else {
				int z=r+1;
				while(true) {
					if(z%d==0) {
						v=z;
						break;
					}else if(z>d*2) {
						v=d*2;
						break;
					}
					else {
						z++;
					}
				}
				System.out.println(v);
			}
			n--;
		}
	}
}
