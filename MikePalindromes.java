import java.util.*;//798A
public class MikePalindromes {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String n=S.next();
		int i,j,count=0;
		for(i=0,j=n.length()-1;(i<n.length()/2) && (j>=n.length()/2);i++,j--) {
			if(!String.valueOf(n.charAt(i)).equals(String.valueOf(n.charAt(j)))){
				count++;
			}
		}
		if(count<=1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
