package BaekJoon_Level10;
import java.io.*;
public class Movie {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int i=0,j=665;
        while(i!=N){
            j++;
            String s=Integer.toString(j);
            if(s.contains("666")){
                i++;
            }
        }
        System.out.println(j);
    }
}
