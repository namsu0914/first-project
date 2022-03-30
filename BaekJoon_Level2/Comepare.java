package BaekJoon_Level2;
import java.util.Scanner;
public class Comepare {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		
		if(a>b)
			System.out.println(">");
		else if(a<b)
			System.out.println("<");
		else
			System.out.println("==");
            s.close();
	}
}
