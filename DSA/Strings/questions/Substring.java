import java.util.*;
public class Substring{
    public static void main(String args[]){
        // string immutable
// QUE PRINT ALL THE POSSIBLE SUBSTRING OF THE GIVEN STRING
       
       
        String str="anurag";
        //s.charAt(0)=b;//  not possible

        // for(int i=0;i<=str.length();i++){
        //     System.out.println(str.substring(i,str.length()));
        // }
       
       
        for( int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
            System.out.println(str.substring(i,j));

        }
        System.out.println("\n");
        }

       System.out.println( str.substring(3,6));
       String a=str.substring(2,6);
       System.out.println(a);
        System.out.println(str);

        
    }
}