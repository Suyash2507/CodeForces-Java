import java.util.*;//798A
public class ValeraX {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		int flag1=1,flag2=1,flag3=1;
		ArrayList<String> l1 = new ArrayList<String>();
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=S.next();
			int m=arr[i].length()-1;
			while(m>-1) {
				if(!l1.contains(String.valueOf(arr[i].charAt(m)))) {
					l1.add(String.valueOf(arr[i].charAt(m)));
				}
				m--;
			}
		}
		if(l1.size()!=2) {
			flag1=0;
		}
		char a=arr[0].charAt(0);
		char b=arr[0].charAt(n-1);
		for(int k=0;k<n;k++) {
			if(String.valueOf(arr[k].charAt(k)).equals(String.valueOf(a))) {	
			}else {
				flag2=0;
				break;
			}
		}
		for(int l=n-1;l>=0;l--) {
			if(String.valueOf(arr[l].charAt(l)).equals(String.valueOf(b))) {	
			}else {
				flag3=0;
				break;
			}
		}
		if(flag1==0 || flag2==0 || flag3==0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
