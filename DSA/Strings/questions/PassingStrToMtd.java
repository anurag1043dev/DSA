public class PassingStrToMtd{
    public static void Change(String x){
        x="23";
    }
    public static void change(int p){
        p=90;
    }
    public static void main(String args[]){
        
        String x="Anurag";
        Change(x);
        System.out.println(x);
        // no change in value of x => pass  by value

        // but if 
        x="abhinav gan";
        System.out.println(x);  // now it wll update


        int p=10;
        change(p);
        System.out.println(p);
        // no change in value of x => pass  by value

    }
}