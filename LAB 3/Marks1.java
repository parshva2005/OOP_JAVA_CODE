import java.util.*;
public class Marks1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int b=0,m1,m2,m3,m4,m5;
		System.out.print("ENTER A STUDENT 1 MARKS : ");
		m1 = sc.nextInt();
		System.out.print("ENTER A STUDENT 2 MARKS : ");
		m2 = sc.nextInt();
		System.out.print("ENTER A STUDENT 3 MARKS : ");
		m3 = sc.nextInt();
		System.out.print("ENTER A STUDENT 4 MARKS : ");
		m4 = sc.nextInt();
		System.out.print("ENTER A STUDENT 5 MARKS : ");
		m5 = sc.nextInt();
		b=(m1+m2+m3+m4+m5)/5;
		System.out.println(b+"%");
		if(b<40 && b>=0){
			System.out.print("FAIL");
		}
		else if(b>=40 && b<=49){
			System.out.print("THIRD DIVISION");
		}
		else if(b>=50 && b<=59){
			System.out.print("SECOND DIVISION");
		}
		else if(b>=60 && b<=100){
			System.out.print("FIRST DIVISION");
		}
		else{
			System.out.print("INVALID MARKS");
		}
	}
}