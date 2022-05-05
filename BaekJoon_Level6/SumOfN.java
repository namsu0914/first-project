package BaekJoon_Level6;
import java.io.*;
//import java.lang.Integer;
public class SumOfN {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int sum=0;
        String st=br.readLine();
        for(int i=0;i<st.length();i++){
            sum+=((int)st.charAt(i)-48);
        }
        System.out.println(sum);
        br.close();
    }
}
