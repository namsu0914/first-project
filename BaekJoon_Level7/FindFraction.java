package BaekJoon_Level7;
import java.io.*;
public class FindFraction {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int i=0,sum=0;;
        int in1=0,in2=0;
        while(n>sum){
            i++;
            sum+=i;
        }
        if(i%2==0){
            in2=(sum-n)+1;
            in1=(i+1)-in2;
        }else{
            in1=(sum-n)+1;
            in2=(i+1)-in1;
        }
        System.out.println(in1+"/"+in2);
    }
}
