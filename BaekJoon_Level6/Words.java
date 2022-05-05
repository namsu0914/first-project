package BaekJoon_Level6;
import java.io.*;
import java.util.StringTokenizer;

public class Words {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");
        System.out.println(st.countTokens());
    }
}
