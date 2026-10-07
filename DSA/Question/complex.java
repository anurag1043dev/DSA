class ComplexNumber{
    double  x ;
    double y;
 ComplexNumber(double x,double y){
        this.x=x;
        this.y=y;
    }
    ComplexNumber(){};
    void print(){
       if(y>=0) System.out.println(x+"+"+"i"+y);
       
    
    else System.out.println(x+"-"+"i"+(-y));
    } 
    void add(ComplexNumber z){
       // z.x=9;  will tke all obj of complex;
       // we need to add z1+z2
       this.x+=z.x;  // boleto this =z1 for z1.add(z2);
       this.y+=z.y;
    } 
    void multiply(ComplexNumber z){
        this.x=x*z.x - y*z.y;
        this.y=y*z.x +y*z.y;
    }
    void Divide(ComplexNumber z){  // ke liye x and y ko double bna ddo!

        this.x=(x*z.x+y*z.y)/(x*x + z.x*z.x);


    }

}

public class complex{
    public static void main(String[] args){
     ComplexNumber z1=new ComplexNumber(2,-5);
     ComplexNumber z2=new ComplexNumber(9,8);
     z1.print();
     z2.print();
     z1.add(z2);
     z2.multiply(z1);
    
     z1.print();
     z2.print();

     
    }
}