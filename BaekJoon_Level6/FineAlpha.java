package BaekJoon_Level6;
import java.io.*;

public class FineAlpha {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S=br.readLine();
        int[]ex=new int[26];
        for(int i=0;i<26;i++){
            ex[i]=-1;
        }
        for(int i=0;i<S.length();i++){
            if(ex[((int)S.charAt(i))-97]==-1)
                ex[((int)S.charAt(i))-97]=i;
        }
        for(int i=0;i<26;i++){
            System.out.print(ex[i]+" ");
        }
        br.close();
    }
}
