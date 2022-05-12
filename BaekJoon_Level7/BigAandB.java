package BaekJoon_Level7;
import java.io.*;
//import java.util.StringTokenizer;
import java.math.BigInteger;
import java.util.Scanner;
public class BigAandB {
    public static void main(String[] args)throws IOException {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st;
        //st=new StringTokenizer(br.readLine()," ");
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.next());
        BigInteger b=new BigInteger(s.next());

        System.out.println(a.add(b));
    }
}
