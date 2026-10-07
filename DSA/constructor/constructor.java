public class constructor{
    public static class  Car{
        int seats;
        String name;
        double len;
        Car(int x, String s,double l){
          seats=x;
          name=s;
          len=l;
        }
        Car(String n,int x){
            name=n;
            seats=x;
        } //constructor overloading
        void print(){
            System.out.println(seats+" "+name+" "+len);
        }

    }

    // we can add array to constructor ! for changing its size at runtime !

public static class Students{
    int rno;
    String name;
    int marks[];
    Students(int s){
        marks=new int[s];

    }
    Students(int []st){
        marks=st;
    }


}

 public static void main(String args[]){
    Car c1=new Car(98,"bmw",12.3);
    c1.print();
    Car c2=new Car("Alto",780000);
    c2.print();
    Students s1=new Students(4);
    s1.marks[0]=56;
    System.out.println(s1.marks[0]);

    int arr[]={4,7,6,5,4};
    Students s2=new Students(arr);
    s2.marks[0]=40;
    System.out.println("array wale makrs "+s2.marks[0]);// marks array me shallow copy gyii h arr ki

 }
}