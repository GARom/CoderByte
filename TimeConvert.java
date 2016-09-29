import java.util.*;
import java.io.*;

class Function {
    static String TimeConvert(int num) {

        int hrs = num/60;
        int mins = num%60;
        String time = hrs + ":" + mins;

        return time;
    }

    public static void main (String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.print(TimeConvert(s.nextInt()));
    }

}