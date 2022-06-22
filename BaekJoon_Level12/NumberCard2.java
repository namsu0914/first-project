package BaekJoon_Level12;
import java.io.*;
import java.util.*;
public class NumberCard2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringTokenizer st2;
        Map<Integer,Integer>map=new HashMap<>();
        int N=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()," ");

        for(int i=0;i<N;i++){
            int a=Integer.parseInt(st.nextToken());
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }

        StringBuilder sb=new StringBuilder();
        int M=Integer.parseInt(br.readLine());
        st2=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<M;i++){
            int b=Integer.parseInt(st2.nextToken());
            if(map.containsKey(b)){
                sb.append(map.get(b)).append(' ');
            }else{
                sb.append('0').append(' ');
            }
        }
        System.out.println(sb);
    }
}
