package BaekJoon_Level12;
import java.io.*;
import java.util.*;
import java.util.Arrays;
public class NoListenNoSee {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String,Integer>map=new HashMap<>();
        st=new StringTokenizer(br.readLine()," ");
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            map.put(br.readLine(),0);
        }
        int k=0;
        String[]str=new String[N];
        for(int i=0;i<M;i++){
            String s=br.readLine();
            if(map.containsKey(s)){
                str[k]=s;
                k++;
            }
        }
        String[]result=new String[k];
        for(int i=0;i<k;i++){
            result[i]=str[i];
        }
        Arrays.sort(result);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.println(result[i]);
        }
    }
}
