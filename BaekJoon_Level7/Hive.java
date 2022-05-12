package BaekJoon_Level7;
import java.io.*;
public class Hive {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n==1){
            System.out.println(1);
        }
        else{
            int i=0,count=0;
            n=n-1;
            while(n>0){
                n=n-i;
                i+=6;
                count++;
            }
            System.out.println(count);
        }
        
    }
}
