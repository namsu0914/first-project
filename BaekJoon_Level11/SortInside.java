package BaekJoon_Level11;
import java.io.*;
import java.util.Arrays;
public class SortInside {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String t=br.readLine();
        int[]num=new int[t.length()];

        for(int i=0;i<t.length();i++){
            char s=t.charAt(i);
            num[i]=(int)s;
        }
        Arrays.sort(num); 
        for(int i=t.length()-1;i>=0;i--){
            System.out.print(num[i]-48);
        }
        
    }
}
