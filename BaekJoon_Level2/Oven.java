package BaekJoon_Level2;
import java.util.Scanner;
public class Oven {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h,m,time;
		h=s.nextInt();
		m=s.nextInt();
		time=s.nextInt();
		int finH,finM;
		finH=h+(m+time)/60;
		finM=(m+time)%60;
		if(finM>=60) {
			finH++;
			finM-=60;
		}	
		else if(finH>23) {
			finH-=24;
		}
		System.out.printf("%d %d",finH,finM);
        s.close();
	}
}
