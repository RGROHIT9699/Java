import java.util.Scanner;

public class Custom_Sort {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String order = qw.next();
        String s = qw.next();
        System.out.println(customSortString(order, s));
        qw.close();
        
    }
    public static String customSortString(String order, String s) {
        StringBuilder sb=new StringBuilder();
        int[] count=new int[26];
        for(char ch:s.toCharArray())
        {
            count[ch-'a']++;
        }

        for(char c:order.toCharArray())
        {
            while(count[c-'a']>0)
            {
                 sb.append(c);
                 count[c-'a']--;
            } 
        }
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<count[i];j++)
               sb.append((char)(i+'a'));
        }
        return sb.toString();
    }
}
