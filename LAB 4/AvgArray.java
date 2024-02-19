import java.util.*;
public class AvgArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= new int[4];
		int sum=0;
		for(int i=0;i<4;i++){
			System.out.print("ENTER A NUMBER : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		double avg=(sum/4.0);
		System.out.println("AVG : "+avg);
	}
}