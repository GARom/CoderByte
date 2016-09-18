import java.util.*;
import java.io.*;

class Function {
    static String LongestWord(String sen) {
        String[] senArray = sen.split("[^a-zA-Z0-9]");

        int lengthOfWord = 0;
        String longestWord = "";

        for (int i = 0; i < senArray.length; i++) {
            System.out.println(senArray[i].length());
            if (senArray[i].length() > lengthOfWord) {
                longestWord = senArray[i];
                lengthOfWord = senArray[i].length();
            }
        }
        return longestWord;
    }

    public static void main (String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}