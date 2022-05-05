package BaekJoon_Level6;
import java.io.*;

public class Dial {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String num=br.readLine();
        int sec=0;
        for(int i=0;i<num.length();i++){
            
            char a=num.charAt(i);
            if((int)a>=65 &&(int)a<=67){
                sec+=3;
            }else if((int)a>=68 &&(int)a<=70){
                sec+=4;
            }else if((int)a>=71 &&(int)a<=73){
                sec+=5;
            }else if((int)a>=74 &&(int)a<=76){
                sec+=6;
            }else if((int)a>=77 &&(int)a<=79){
                sec+=7;
            }else if((int)a>=80 &&(int)a<=83){
                sec+=8;
            }else if((int)a>=84 &&(int)a<=86){
                sec+=9;
            }else if((int)a>=87 &&(int)a<=90){
                sec+=10;
            }
        }
        System.out.println(sec);
    }
}
