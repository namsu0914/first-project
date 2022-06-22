package BaekJoon_Level12;
import java.io.*;
import java.util.*;
public class StringSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");

        int result=0;
        HashSet<String> hs=new HashSet<>();
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            hs.add(br.readLine());
        }
        for(int i=0;i<M;i++){
            if(hs.contains(br.readLine())){
                result++;
            }
        }
        System.out.println(result);
    }
}
