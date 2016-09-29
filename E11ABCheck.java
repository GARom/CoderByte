import java.util.*;
import java.io.*;

public class E11ABCheck {
    static Boolean E11ABCheck(String str) {
        String lowercaseStr = str.toLowerCase();
        char[] ca = lowercaseStr.toCharArray();
        for (int i = 0; i < str.length()-4; i++) {
            if (ca[i] == 'a' && ca[i + 4] == 'b') return true;
            if (ca[i] == 'b' && ca[i + 4] == 'a') return true;
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(E11ABCheck(s.nextLine()));
    }

}