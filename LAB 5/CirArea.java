import java.util.*;
class Circle{
	double Area(int r){
		double area = 3.14*r*r;
		return area;
	}
}
public class CirArea{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle radius = new Circle();
		System.out.print("ENTER A RADIUS :");
		int r = sc.nextInt();
		double area = radius.Area(r);
		System.out.print("Area = "+area);
	}		
}