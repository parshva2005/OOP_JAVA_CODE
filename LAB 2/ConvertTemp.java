import java.util.*;
public class ConvertTemp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f;
		System.out.print("ENTER A TEMPERATURE(f) :- ");
		f=sc.nextInt();
		double c=(f-32)*(5/9.0);
		System.out.print(c);
	}
}