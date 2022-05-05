package BaekJoon_Level6;
import java.io.*;

public class Askii {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String n=br.readLine();
        int i=(int)n.charAt(0);
        System.out.println(i);
        br.close();
    }
}
