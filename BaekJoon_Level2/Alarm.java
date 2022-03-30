package BaekJoon_Level2;
import java.util.Scanner;
public class Alarm {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h,m;
		h=s.nextInt();
		m=s.nextInt();
		if (m>=45)
			System.out.printf("%d %d",h,m-45);
		else if(h==0)
			System.out.printf("%d %d",23,m+15);
		else
			System.out.printf("%d %d",h-1,m+15);
        s.close();
	}
}
