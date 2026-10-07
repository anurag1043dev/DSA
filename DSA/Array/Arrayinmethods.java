public class Arrayinmethods{
    public static void main(String []args){
        int x[]={10,3,5,6};
        int z=34;
       // System.out.println(x[2]);
        //change(x);
        //System.out.println(x[2]);

        change(z);
        System.out.println("value of z "+z); //yha main me update nhi hogi
                                            // but agr hum func me direct print ker de to 99 aayega!
    }
    // public static void change( int[] x){
    //     x[2]=99;   // value of arr gets updated 
    //                // Pass by Refrence  
        



    public static void change( int z){
        z=99;   // wont change value of x 
                   // Pass by Value

                   // z ek naya variable bna jo func ke liye input dega say "Y"
                   // " will now contain Z whose value is 34
                  // and got updated to 99  
        
    
    }
    
}