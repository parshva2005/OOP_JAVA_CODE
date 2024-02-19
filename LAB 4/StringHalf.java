import java.util.*;
public class StringHalf{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A STRING : ");
		String a = sc.nextLine();
		System.out.println("STRING LENGTH : "+a.length());
		for(int i=(a.length()/2);i<a.length();i++){
			System.out.print(a.charAt(i));
		}	
	}
}