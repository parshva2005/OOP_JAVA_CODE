import java.util.*;
public class Max3num{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER 1 : ");
		int a = sc.nextInt();
		System.out.print("ENTER A NUMBER 2 : ");
		int b = sc.nextInt();
		System.out.print("ENTER A NUMBER 3 : ");
		int c = sc.nextInt();
		int ans = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.print(ans+" is maximum number.");
	}
}