import java.util.*;
public class VowCons{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENETER A CHARACTER : ");
		String a=sc.nextLine();
		int vow=0,con=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'){
				vow++;
			}
			else{
				con++;
			}
		}
		System.out.println("vowel characters is :"+vow);
		System.out.println("consonants characters is :"+con);
	}
}