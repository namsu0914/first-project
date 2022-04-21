package BaekJoon_Level3;
import java.util.Scanner;

public class AplusBcase4{
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        while(s.hasNextInt()){
            a=s.nextInt();
            b=s.nextInt();
            System.out.println(a+b);
        }
        s.close();
    }
}