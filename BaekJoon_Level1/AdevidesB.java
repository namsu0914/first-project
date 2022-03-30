package BaekJoon_Level1;
import java.util.Scanner;
public class AdevidesB{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        double a,b;
        a=s.nextDouble();
        b=s.nextDouble();
        double result;
        result=a/b;
        System.out.println(result);
        s.close();
    }
}