package BaekJoon_Level4;

import java.io.*;
import java.io.IOException;
import java.util.HashSet;

public class Rest {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> hs=new HashSet<Integer>();
        
        for(int i=0;i<10;i++){
            hs.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(hs.size());

        br.close();
        //bw.flush();
        //bw.close();
    }
}
