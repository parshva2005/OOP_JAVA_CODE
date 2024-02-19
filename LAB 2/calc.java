import java.util.*;
public class calc{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		String s;
		System.out.print("ENTER A NUMBER 1 :- ");
		a=sc.nextInt();
		System.out.print("ENTER A NUMBER 2 :- ");
		b=sc.nextInt();
		System.out.print("ENETR A CHOICE(ADDITION,SUBSTRACTION,DEVISION,MULTIPLYCATION) :- ");
		s=sc.next();
		if(s.toUpperCase().equals("ADDITION")){
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(s.toUpperCase().equals("SUBSTRACTION")){
			System.out.println(a+"-"+b+"="+(a-b));
		}
		else if(s.toUpperCase().equals("DEVISION")){
			System.out.println(a+"/"+b+"="+(a/b));
		}
		else if(s.toUpperCase().equals("MULTIPLYCATION")){
			System.out.println(a+"*"+b+"="+(a*b));
		}
		else{
			System.out.println("ENTER CORRECT CHOICE FROM GIVEN OPTION.");
		}
	}
}