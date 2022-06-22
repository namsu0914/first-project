package BaekJoon_Level12;
import java.io.*;
import java.util.*;
public class NOfString {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S=br.readLine();
        StringBuilder sb=new StringBuilder();
        HashSet<String>hs=new HashSet<>();
        String str="";
        for(int i=0;i<S.length();i++){
            for(int j=i;j<S.length();j++){

                str+=S.charAt(j);
                hs.add(str);
                System.out.println(str);
            }
            str="";
        }
        System.out.println(hs.size());
    }
}
