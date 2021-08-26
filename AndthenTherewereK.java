import java.util.*;
public class AndthenTherewereK {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int t=S.nextInt();
		while(t>0) {
			int n=S.nextInt();int len=0,k=0;
			for(int i=0;i<Integer.toBinaryString(n).length();i++) {
				len++;
			}
			String st="";
			k=len;
			while(len>0) {
				st=st+"1";
				len--;
			}
			StringBuilder sb= new StringBuilder();
			for(int j=k-1;j>=0;j--) {
				if(Integer.toBinaryString(n).charAt(j)==st.charAt(j) && st.charAt(j)=='1'){
					sb.append("1");
				}else {
					while(Integer.toBinaryString(n).charAt(j)!='1' && j>=0) {
						sb.append("1");
						j--;
					}
					System.out.println(Integer.parseInt(sb.reverse().toString(),2));
					break;
				}
			}
			t--;
		}
	}
}
