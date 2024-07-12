import java.util.Scanner;

public class Crawler_Log_Folder {

    public static void main(String[] args) {
        // String str = "d1/";
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = qw.next();
        }
        System.out.println();
        System.out.println(minOperations(str));
        qw.close();
        // System.out.println(str.substring(1,str.length()-1));
        
    }
    public static int minOperations(String[] logs) {
        int n = logs.length;
        int cou=0;
        for(int i=0;i<n;i++){
            if(logs[i].equals("../")){
                if(cou>0){
                    cou--;
                }
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                cou++;
            }
        }
        return cou;
    }
}