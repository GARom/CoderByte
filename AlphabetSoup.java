import java.util.*;
import java.io.*;

class Function {
    static String AlphabetSoup(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSoup(s.nextLine()));
    }

}