import java.io.*;
import java.util.*;
class P14{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        char s=in.next().charAt(0);
        if((s>='a'&&s<='z')||(s>='A'&&s<='Z')){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
