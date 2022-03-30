package BaekJoon_Level2;
import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
		int x,y;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		
		if(x>0&&y>0)
			System.out.println("1");
		else if(x<0&&y>0)
			System.out.println("2");
		else if(x<0&&y<0)
			System.out.println("3");
		else if(x>0&&y<0)
			System.out.println("4");
            s.close();
	}
}
