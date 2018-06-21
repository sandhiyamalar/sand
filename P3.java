import java.io.*;
import java.util.*;
class P3{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        char s=in.next().charAt(0);
        int c=0;
        char[] vol={'a','e','i','o','u'};
        for(int i=0;i<vol.length;i++){
            if(s==vol[i]){
                c++;
                break;
            }
        }
        if(c!=0){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
