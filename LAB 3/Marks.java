import java.util.*;
public class Marks{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int b=0;
		for(int i=0;i<5;i++){
			System.out.print("ENTER A STUDENT "+(i+1)+" MARKS : ");
			a[i] = sc.nextInt();
			b=b+a[i];
		}
		b=b/5;
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