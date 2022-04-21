package BaekJoon_Level3;
import java.io.*;

public class AddCycle {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine()); 
        int i=0;
        int num=N;
        do{
            i++;
            N=((N%10)*10)+((N%10)+(N/10))%10;
            
        }while(num!=N);
        
        System.out.println(i);
        //bw.write(i); 이렇게 쓰면 오류가 난다.. 왜일까?
    }
}
