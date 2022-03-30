package BaekJoon_Level2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		
		year=s.nextInt();
		if(year%400==0)
			System.out.println("1");
		else if((year%100!=0)&&(year%4==0))
			System.out.println("1");
		else
			System.out.println("0");
        s.close();
	}
}
