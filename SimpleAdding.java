import java.util.*;
import java.io.*;
/*This is very similar to the FirstFactorial problem*/

class Function {
     static int SimpleAdding(int num) {

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        return sum;

    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        //Changed from s.nextLine() to nextInt() because nextLine() 
        //takes in String and we need an int        
        System.out.print(SimpleAdding(s.nextInt()));

    }

}
