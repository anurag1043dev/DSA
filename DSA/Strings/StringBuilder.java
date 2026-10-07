public class stringBuilder{
    public static void main(strign args[]){

        //EMPTY STRING BUILDER
        StringBuilder s=new StringBuilder();
        System.out.println(s.capacity());  // default capacity is 16


        StringBuilder sb=new StringBuilder("Anurag");// string anurag bnegii
        System.out.println(sb);

        // function , sb changes it capacity dynamically when we add more characters to it
        s.append(" Gupta");
        System.out.println(sb);

        //2 s.setCharAt(index, char) => changes the character at given index
        sb.setCharAt(0,'b');  // note => IT DOES NOT EFFECT TIME COMPLEXTY UNLIKE JO HUM SUBSTR SE KR RE THE
        System.out.println(sb);  // tIMEcOMPLEXITY IS O(1) => constant time complexity

        //3 s.insert(index, char) => insert the character at given index
        sb.insert(0,'A');   

        //4 s.delete(index1, index2) => delete the character from index1 to index2-1
        sb.delete(0,1);  // delete the first character

        //5 s.reverse() => reverse the string
        sb.reverse(); 
        String g="Anuragf";
        StringBuilder sc=new StringBuilder(g);
        sc.reverse();
        g=sb.toString();

        //6 
        sb.delete(0,2);


    }
}