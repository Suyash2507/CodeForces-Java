import java.util.*;
public class RegistrationSystem {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int n=S.nextInt();
		for(int i=0;i<n;i++) {
			String s=S.next();
			if(!map.containsKey(s)) {
				map.put(s,1);
				System.out.println("OK");
			}
			else {
				int k=map.get(s);
				System.out.println(s.concat(String.valueOf(k)));
				map.remove(s);
				map.put(s,k+1);
			}
		}
		
	}
}
