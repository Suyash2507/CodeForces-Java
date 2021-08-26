import java.util.*;//1111A
public class superhero {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String a=S.next();
		String b=S.next();
		boolean flag=false;
		String[] ar1= {"a","e","i","o","u"};
		String[] ar2= {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
		if(a.length()!=b.length()) {
			System.out.println("No");
		}else {
			for(int i=0;i<a.length();i++) {
				if((Arrays.asList(ar1).contains(String.valueOf(a.charAt(i))) && Arrays.asList(ar1).contains(String.valueOf(b.charAt(i)))) || (Arrays.asList(ar2).contains(String.valueOf(a.charAt(i))) && Arrays.asList(ar2).contains(String.valueOf(b.charAt(i))))){
					flag=true;
				}
				else {
					flag= false;
					break;
				}
			}
			if(flag) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
