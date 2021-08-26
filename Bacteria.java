import java.util.*;
public class Bacteria {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int x=S.nextInt();int count=0;
		String z=Integer.toBinaryString(x);
		for(int j=0;j<z.length();j++) {
			if(z.charAt(j)=='1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
