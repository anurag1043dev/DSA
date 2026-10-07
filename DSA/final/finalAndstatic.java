class Cricketer{
     static String country="India";
    int runs;
    String name;

    double avg;
    void print(){ // ye mtd sabke liye alag hoga to ye static me set nhii hoga
       System.out.print(runs+" "+name+" "+avg); // sabke runs etc alag honge!+96
       
    }
    static void greet(){  // would workd sharable function!
        System.out.println("hello world  from java");
    } 


}
public class finalAndstatic {

    public static void main(String[] args){
        Cricketer c1=new Cricketer();
        Cricketer c2=new Cricketer();
        c1.country="Japan";
        
       // c1.country="england";  will generate an error ! bhau
        System.out.println(c2.country);
         // static variable is shared by all objects of class Cricketer
        fun();
        c1.greet();

    }
    // private  void fun(){  // error non static mtd cnt be refernced from static context
    //     System.out.println("Hello Ajay");
    // }

    //  void fun(){   // generates an Error its non static function
    //     System.out.println("heeloo Ajay");
    // }
    private static  void fun(){
                 System.out.println("Hello Ajay");
    }
}