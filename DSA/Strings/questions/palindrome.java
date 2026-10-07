

public class palindrome{
    public static void main(String args()){
        String str="madam";
        

        // mtd 2 
       boolean isPalin(String s){ 
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charat(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
        }
    }
}