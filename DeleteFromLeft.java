import java.util.*;//122A
public class DeleteFromLeft {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		String a=S.next();
		String b=S.next();
		int flag=0,t=0;
		int total=a.length()+b.length();
		if(a.charAt(a.length()-1)==b.charAt(b.length()-1)) {
			if(a.equals(b)) {
				System.out.println("0");
			}else {
				int min=(a.length()>=b.length()?b.length():a.length());min--;
				int k=min;
				while(min>=0) {
					if(a.charAt(min)!=b.charAt(min)) {
						t=min;
						flag=1;
						break;
					}
					min--;	
				}
				if(flag==1) {
					System.out.println(total-(2*t));
				}else if(flag==0) {
					System.out.println(total-(2*k));
				}
			}
		}else {
			System.out.println(total);
		}
	}
}
