//public  class constructor2{


       // USE OF THIS KEYWORD IN PRIVATE CLASS !

     class Pokemon{// private class can be acess within class constructor 2
        private int power;                     // => accesed within the class
        int speed;
        String attack;
        int defence; 
        String type;
        String name;
    
    Pokemon(String t,int power){
        this.name=t;
        this.power=power;  // getting private power by Constructor!

    }
    Pokemon(){};

    int getPower(){
        return power;
    }

    void print(){
        System.out.println("name is "+name+" powre is "+power);// getting private power by print function
    }
    }


    public class constructor2{
    public static void main(String[] agrs){
   Pokemon p1=new Pokemon();
   p1.type="electric";p1.name="pikachuu";p1.attack="thunderboult";

   Pokemon p2=new Pokemon();
   p2.name="Grayninja";p2.type="dark";p2.attack="Darkballs";


   // Shllow Copy !
   Pokemon p3=p1; //P3 IS SHALLOW COPY OF P1=>  P3 CAN COntrol  p1!
   //eg
   p3.type="Water";
   System.out.println(p1.type);
    

    // By Constructor !
    Pokemon p4=new Pokemon("Charizard",100);
    p4.print();}

    System.out.println(p4.getPower());
}
