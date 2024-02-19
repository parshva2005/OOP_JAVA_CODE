import java.util.*;
class Time{
	int min;
	int hour;
	Time(){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A MINUTE : ");
		min = sc.nextInt();
		System.out.print("ENTER A HOUR : ");
		hour = sc.nextInt();
	}
	void add(Time time1,Time time2){
		int min = time1.min+time2.min;
		int hour = time1.hour+time2.hour;
		if(min>60){
			hour++;
			min-=60;
		}
		System.out.print("TIME :- "+hour+" : "+min);
	}
}
public class AddTime{
	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time();	
		time1.add(time1,time2);
	}
}