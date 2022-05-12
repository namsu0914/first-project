package BaekJoon_Level7;
import java.io.*;
public class Sugar {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        int x=N/5;
        int five=-1;
        for(int i=x;i>=0;i--){
            if((N-(i*5))%3==0){
                five=i;
                break;
            }
        }
        if(five==-1){
            System.out.println(five);
        }else{
            System.out.println(five+(N-(five*5))/3);
        }
    }
}
