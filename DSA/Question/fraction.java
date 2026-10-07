class Fractions{
    int num;
    int dem;
    Fractions(int num,int dem){
        this.num=num;
        this.dem=dem;
        Simplify();
    }
    void print(){
        System.out.println(num+"/"+dem);
    }
    void Add(Fractions f){
        num=num*f.dem+dem*f.num;
        dem=dem*f.dem;
        Simplify();
    }
    void Multiply(Fractions f){
        num=num*f.num ;
        dem=dem*f.dem;
        Simplify();             // hrr operation ke baad simplify kr do
    }
    void div(Fractions f){
       num=num*f.dem ;
        dem=dem*f.num;
        Simplify();
    }
    void Simplify(){
        boolean isNegative=(num*dem<0) ? true:false;
        num=Math.abs(num);
        dem=Math.abs(dem);
        int gcd=hcf(num,dem);
        num=num/gcd;
        dem=dem/gcd;
        if(isNegative) num= -num;

    }
    int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}
public class fraction{
    public static void main(String [] agrs){
    Fractions f1=new Fractions(20,2);
    Fractions f2=new Fractions(7,3);
    f1.print();
    f1.Add(f2);
    f1.Multiply(f2);
    f1.print();
    }
    
}