package BaekJoon_Level9;
import java.io.*;
public class Factorial {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int result=fac(N);
        
        System.out.println(result);
    }
    private static int fac(int N){
        if(N==0)
            return 1;
        return N*fac(N-1);
    }
}
