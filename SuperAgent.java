import java.util.*;
public class SuperAgent {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String[][] arr=new String[3][3];
		String a=S.nextLine();
		String b=S.nextLine();
		String c=S.nextLine();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==0) {
					arr[i][j]=String.valueOf(a.charAt(j));
				}
				else if(i==1) {
					arr[i][j]=String.valueOf(b.charAt(j));
				}
				else {
					arr[i][j]=String.valueOf(c.charAt(j));
				}
			}
		}
		boolean f=true;
		if(arr[0][0].equals("X")) {
			if(!arr[2][2].equals("X")) {
				f=false;
			}
		}
		if(arr[0][1].equals("X")) {
			if(!arr[2][1].equals("X")) {
				f=false;
			}
		}
		if(arr[0][2].equals("X")) {
			if(!arr[2][0].equals("X")) {
				f=false;
			}
		}
		if(arr[1][0].equals("X")) {
			if(!arr[1][2].equals("X")) {
				f=false;
			}
		}
		if(arr[2][2].equals("X")) {
			if(!arr[0][0].equals("X")) {
				f=false;
			}
		}
		if(arr[2][1].equals("X")) {
			if(!arr[0][1].equals("X")) {
				f=false;
			}
		}
		if(arr[2][0].equals("X")) {
			if(!arr[0][2].equals("X")) {
				f=false;
			}
		}
		if(arr[1][2].equals("X")) {
			if(!arr[1][0].equals("X")) {
				f=false;
			}
		}
		if(f) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
