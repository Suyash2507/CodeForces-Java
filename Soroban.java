import java.util.*;
public class Soroban {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);String f;
		int n=S.nextInt();
		if(n==0) {
			System.out.println("O-|-OOOO");
		}
		else 
		{
			String s=String.valueOf(n);
			int k=s.length();int w;
			for(int i=k-1;i>=0;i--) {
				int x=0;
				int p=Integer.parseInt(String.valueOf(s.charAt(i)));
				if(p<5) 
				{
					f="O-|";
					w=p;
					while(w!=0) {
						f=f.concat("O");
						w--;
						x++;
					}
					f=f.concat("-");
					int temp=4-x;
					while(temp!=0) {
						f=f.concat("O");
						temp--;
					}
				}
				else 
				{
					f="-O|";
					p=p-5;
					w=p;
					if(p==0) 
					{
						f=f.concat("-OOOO");
					}
					else 
					{
						while(w!=0) {
							f=f.concat("O");
							w--;
							x++;
						}
						f=f.concat("-");
						int temp=4-x;
						while(temp!=0) {
							f=f.concat("O");
							temp--;
						}
					}
				}
				System.out.println(f);
			}
		}
	}
}
