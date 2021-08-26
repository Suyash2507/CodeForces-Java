import java.util.*;//122A
public class LuckyDivision {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int flag1=0,flag2=0;
		String m=String.valueOf(n).replaceAll("4","");
		m=m.replaceAll("7","");
		if(m.equals("")) {
			flag1=1;
		}
		if(flag1==1) {
			System.out.println("YES");
		}else {
			for(int i=1;i<=n;i++) {
				String z=String.valueOf(i).replaceAll("4","");
				z=z.replaceAll("7","");
				if((i%4==0 && n%i==0) || (i%7==0 && n%i==0) || (z.equals("") && n%i==0)) {
					System.out.print("YES");
					flag2=1;
					break;
				}
			}
			if(flag2==0) {
				System.out.print("NO");
			}
		}
	}
}
