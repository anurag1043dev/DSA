public class builtinMtd{
    
    public static void main(String args[]){
        
    String s="Anurag gupta";

    // .INDEXOF()

    System.out.println(s.indexOf('a'));


     System.out.println(s.lastIndexOf('a'));

     // yha to hammeri string ko lower case krdega
     System.out.println(s.toLowerCase());

      System.out.println(s.contains("rag")); //return true o f flase!

       System.out.println(s.startsWith("Anu"));
        System.out.println(s.endsWith("gupta"));

        // VIP => string is immutable;
        //cases concat , upeer  Lower 

        String str ="Anurag";
        str.toLowerCase();
        System.out.println(str); // no change 
        // we need to do => s=n.toLowerCase(); 

        String a="Anurag";
        String b="Anu";
        System.out.println(a.compareTo(b)); // printd 3 ie no of extra letters if shuruwat me string same he


 //  Comparing Strings
         String c="harmett";
        String d="sneha";
        System.out.println(c.compareTo(d));// print krega result of ascii of (h-s)

//  Concatenating Strings

     String e="harmett";
    String f="sneha";
    e=e+f+"hello"; // NO NEED TO CONCAT
    System.out.println(e);

        System.out.println(e.concat(f));// want change A 
        // note STRING IS IMMUTABLE SO 
        // if a.concat(b)
        // then sout(a); will not concat string 
          //or
          e=e.concat(f); // Now a changed
          System.out.println(e);

          //VIP THING 
        1 =>  String st="Bhakti";
          s+="hi shaktti he";
          s+='\n' // abhi koi change nhi ayega but jab next elemnt add hoga to wo next line me jayega


           System.out.println  ("raghav"+10+20);  //=> raghav1020

        3 => System.out.println('a'+2+"Iasha"); // 98iasha
    }
} 