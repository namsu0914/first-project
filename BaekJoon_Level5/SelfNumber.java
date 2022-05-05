package BaekJoon_Level5;

public class SelfNumber{
    public static void main(String[] args) {
        boolean[] notSelfNumber=new boolean[10001];
        for(int i=1;i<10000;i++){
            int n=hap(i);
            if(n<=10000){
                notSelfNumber[n]=true;
            }
        }

        for(int i=1;i<notSelfNumber.length;i++){
            if(notSelfNumber[i]!=true){
                System.out.println(i);
            }
        }
    }
    private static int hap(int n){
        int box=n;
        while(n!=0){
            box+=n%10;
            n=n/10;
        }
        return box;
    }
}
