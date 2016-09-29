import java.util.*;
import java.io.*;

class Function {
    public static String CheckNums(int num1, int num2) {

        if(num2 > num1) {
            return "true";
        }else if(num2 < num1) {
            return "false";
        }else{
            return "-1";
        }

    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(CheckNums(s.nextInt(),s.nextInt()));
    }
}


