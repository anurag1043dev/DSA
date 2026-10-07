import java.util.*;
class myArrayList{    // USER DEFINED DATAA STRUCTURES
    int arr[];
    int idx=0;
    
    int size=0;

    myArrayList(int capacity){
        arr=new int[capacity];
    }
    int capacity(){
        return arr.length;
    }

    void add(int ele){
        arr[idx++]=ele;
        size++;
    }
    int Size(){
        return arr.length;
    }
    void display(){
        // for(int i:arr){  // for displaying all the elment 
        //     System.out.println(i);

            // BUT WE NEED KI CURRENT TIME P KITTE ELEMNT HE WHI DIKHAA
            for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
        }
    }


public class Arraylist{
    public static void main(String args[])

{
   myArrayList arr=new myArrayList(8);  //  note if arrki lenght =3 then we cnt add 
   //                                    more elemnts to arry by our arr.add function
    //  How to tackle that problem ?
   arr.add(10); arr.add(60); arr.add(70);
   System.out.println(arr.capacity());
   arr.display();
}
}