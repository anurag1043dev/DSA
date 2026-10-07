class Students{
        String name;
        double cgpa;
        private int rno;
        
       
    private void print(){ 
        System.out.println(name+" "+cgpa+" "+rno);
        }

       void p(){
        print();
       }
    void getrno(int rno){
        this.rno=rno;
    }
    double getcgpa(){
        return cgpa;// ye value return kr ra h to this method nhi lga!
    }
    void setrno(int x){
        rno=x;   // this.rno=x;


    }

public class polymorphism{
    // public static class Dog{
    //     void speak(){
    //         System.out.println("bahu bhau"); // method overriding !
    //     }

    // }
    // public static class Cat{
    //     void speak(){
    //         System.out.println("meooooowww");
    //     }


    // }
    // public static class Lion{
    //     void speak(){
    //         System.out. println("roaaaar");
    //     }


    // }
    // public static void main(String arsg[]){
    //     Dog d=new Dog();
    //     Cat c=new Cat();
    //     Lion l=new Lion();
    //     d.speak();
    //     c.speak();
    //     l.speak();
    // }

    public static void main(String args[]){

        Students s1=new Students();
        // s1.cgpa=8.9;
        // s1.name="Hama";
         s1.p();

        
    }

}