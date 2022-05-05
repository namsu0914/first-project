package BaekJoon_Level6;
import java.io.*;
public class Croatia {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int index=0;
        String []al=new String[8];
        al[0]="c=";al[1]="c-";al[2]="dz=";al[3]="d-";al[4]="lj";
        al[5]="nj";al[6]="s=";al[7]="z=";
        String text=br.readLine();
        for(int i=0;i<al.length;i++){
            if(text.contains(al[i])){
                text=text.replaceAll(al[i], "?");
            }
        }
        System.out.println(text.length());
    }
}
