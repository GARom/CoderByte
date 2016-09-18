import java.util.*;
import java.io.*;

class Function {
     static int FirstFactorial(int num) {

        int factorial = num > 0 ? num : 1;
        for(int i = num -1; i > 1; i--) {
            factorial *= i;
        }
        return factorial;

    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        //Changed from s.nextLine() to nextInt() because nextLine() 
        //takes in String and we need an int
        System.out.print(FirstFactorial(s.nextInt()));
    }

}