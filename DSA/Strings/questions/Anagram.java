import java.util.*;
public class Anagram{
    public static void main(String args[]){
    //     String s1="latent";
    //     String s2="telent";
    //     boolean flag=true;

    //  char arr1[]=s1.toCharArray();
    //  char arr2[]=s2.toCharArray();// watsing too much space

    //  Arrays.sort(arr1);
    //  Arrays.sort(arr2);

    //  if(arr1.length==arr2.length){
    //      for(int i=0;i<arr1.length;i++){
    //          if(arr1[i]!=arr2[i]){
    //              flag=false;
    //              break;
    //          }
    //      }
    //      System.out.println(flag);


    //    // StringBuilder sb=new StringBuilder();
    // }
    // else{
    //     System.out.println("Not an Anagram");
    // }



    // more efficient way;
    String s1="anagram";
    String s2="nagaram";

    Map<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    char sh;
    for(int i=0;i<s2.length();i++){
        char sh=s2.charAt(i);
        if(!map.containsKey(ch)){
        }
}
}