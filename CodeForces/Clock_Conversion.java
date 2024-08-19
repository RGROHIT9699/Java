import java.util.Scanner;
public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int numberOfTEst= in.nextInt();
        String arr[]= new String[numberOfTEst];
        for(int i=0; i<numberOfTEst; i++){
            arr[i]=in.next();
        }
        for(int i=0; i<numberOfTEst; i++){
            String[] s=arr[i].split(":");
            int hh=Integer.valueOf(s[0]);
            if(hh==0){
                System.out.println("12:"+s[1]+" AM");
            }
            else if(hh<12){
                System.out.println(arr[i]+" AM");
            }
            else if(hh==12){
                System.out.println(arr[i]+" PM");
            }
            else{
                int a=hh-12;
                if(a<10){
                    System.out.println("0"+a+":"+s[1]+" PM");
                }
                else{
                    System.out.println(a+":"+s[1]+" PM");
                }
            }
        }
        in.close();
    }
}