package BaekJoon_Level12;
import java.io.*;
import java.util.*;
public class DifferentialSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st,st1,st2;

        HashSet<Integer>hs=new HashSet<>();

        st=new StringTokenizer(br.readLine()," ");
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());

        st1=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<A;i++){
            int s=Integer.parseInt(st1.nextToken());
            hs.add(s);
        }
        st2=new StringTokenizer(br.readLine()," ");
        int result=0;
        for(int i=0;i<B;i++){
            int s =Integer.parseInt(st2.nextToken());
            if(hs.contains(s)){
                result++;
            }
        }
        System.out.println(A+B-2*result);
    }
}
