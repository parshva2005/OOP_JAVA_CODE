import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int a = sc.nextInt();
		int n,sum=0,rem;
		n=a;
		while(a>0){
			rem=a%10;
			sum=sum*+rem;
        	a=a/10;
		}
		if(sum==n){
        	System.out.print("PELINDROME");
	    }
	    else{
	        System.out.print("NOT PELINDROME");
	    }
	}
}