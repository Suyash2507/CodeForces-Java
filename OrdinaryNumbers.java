import java.util.*;
public class OrdinaryNumbers {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		for(int i=0;i<n;i++) {
			int a=S.nextInt();
			int count=0;
			for(int j=1;j<a;j++) {
				StringBuilder k=new StringBuilder(String.valueOf(j));
				if(k.length()>1) {
					k=k.replace(0,k.length()+1,String.valueOf(k.charAt(0)));
					if(k.toString().equals("")){
						count++;
					}
				}else {
					count=j;
				}
				k.setLength(0);
			}
			System.out.println(count);
		}
	}
}
