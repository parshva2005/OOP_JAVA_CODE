import java.util.*;
public class ReverseNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENETER A ARRAY LENGTH : ");
		int x = sc.nextInt();
		int[] a = new int[x];
		for(int i=0;i<x;i++){
			System.out.print("ENTER A NUMBER : ");
			a[i]=sc.nextInt();
		}
		for(int i=(x-1);i>=0;i--){
			System.out.println(a[i]);
		}
	}
}