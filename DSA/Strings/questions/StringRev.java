public class StringRev{
    public static void main(String args[]){
         String name="Anurag Gupta is outstanding person";
    String wrd[]=name.split(" ");
    System.out.println(wrd[0]);
    
    String rev="";

    for(int i=0;i<wrd.length;i++){

    
    char arr[]=wrd[i].toCharArray();
    //System.out.println(arr[0]);
    
    for(int j=arr.length-1;j>=0;j--){    // Reverses the whole string and words
        rev+=arr[j];

    }
    rev+=" ";
    }
    System.out.print(rev);   // this improved version reverses each word of 
                             // string not their sequence !

    }
    }
