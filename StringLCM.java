import java.util.*;//1473B
public class StringLCM {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		while(n!=0){
			String a=S.next();
			String b=S.next();
			int a1=a.length(),b1=b.length(),max,step,lcm=0;
			String t1="",t2="";
			if(a1>b1){
		         max=step=a1;
		    }else{
		         max=step=b1;
		    }
		    while(a1!= 0) {
		        if(max%a1==0 && max%b1==0) {
		            lcm=max;
		            break;
		        }
		         max += step;
		    }
		    int a2=lcm/a.length();
		    int b2=lcm/b.length();
		    while(a2!=0) {
		    	t1=t1+a;
		    	a2--;
		    }
		    while(b2!=0) {
		    	t2=t2+b;
		    	b2--;
		    }
		    if(t1.equals(t2)) {
		    	System.out.println(t1);
		    }else {
		    	System.out.println("-1");
		    }
			n--;
		}
	}
}
