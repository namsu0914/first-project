package BaekJoon_Level12;
import java.io.*;
import java.util.*;
public class Poketmon {
    public static void main(String[] args) throws IOException{
        Map<Integer,String>map=new HashMap<>();
        Map<String,Integer>map2=new HashMap<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine()," ");

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        for(int i=0;i<N;i++){
            String str=br.readLine();
            map.put(i+1,str);
            map2.put(str,i+1);
        }
        for(int i=0;i<M;i++){
            String s=br.readLine();
            if(s.charAt(0)<='Z' &&s.charAt(0)>='A'){
                System.out.println(map2.get(s));
            }else{
                System.out.println(map.get(Integer.parseInt(s)));
            }
        }
    }
}
