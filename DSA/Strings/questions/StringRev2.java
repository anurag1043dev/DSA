public class StringRev2{
    public static void main(String args[]){
        String name="Anurag Gupta is outstanding person";
        String rev="";
        char arr[]=name.toCharArray();
    //System.out.println(arr[0]);
    
    for(int j=arr.length-1;j>=0;j--){    // Reverses the whole string and words
        rev+=arr[j];

    }
    
    
    System.out.print(rev);  
    }
}