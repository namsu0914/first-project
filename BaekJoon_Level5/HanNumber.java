package BaekJoon_Level5;
//import java.util.function.*;
import java.io.*;
import java.lang.Integer;

public class HanNumber {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); 

        System.out.println(hansu(t));
    }

    private static int hansu(int N){
        int i=0;
        if(N<100){
            i=N;
        }
        else if(N>=100){
            i=99;
            for(int k=100;k<=N;k++){
                if(((k%10)-(k/10)%10)==((k/10)%10)-(k/100)){
                    i++;
                }
            
            }
        }
        return i;
        
    }
}
