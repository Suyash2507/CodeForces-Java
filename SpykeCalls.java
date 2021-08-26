import java.util.*;
public class SpykeCalls {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		int n=S.nextInt();int c=0;
		boolean bol=false;
		for(int i=0;i<n;i++) {
			int a=S.nextInt();
			l1.add(a);
		}
		if(n==1) {
			System.out.println(0);
		}
		else {
			for(Integer k : l1) {
				if(!l2.contains(k)) {
					l2.add(k);
					int oc=Collections.frequency(l1, k);
					if(k!=0) {
						if(oc==1) {}
						else if(oc%2==0) {
							c=c+(oc/2);
						}
						else if(oc%2!=0) {
							bol=true;
							break;
						}
					}
				}
			}
			if(bol) {
				System.out.println(-1);
			}
			else {
				System.out.println(c);
			}
		}
	}
}
