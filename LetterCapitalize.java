import java.util.*;
import java.io.*;

class Function {
    static String LetterCapitalize(String str) {

        char[] ch = str.toCharArray();

        for (int i=0; i <= ch.length-1; i++)
            if (ch[i] == ch[0])
                ch[0] = Character.toUpperCase(ch[0]);
            else if (ch[i-1] == ' ')
                ch[i] = Character.toUpperCase(ch[i]);

        return new String(ch);

    }

    public static void main (String[] args) {

        Scanner  s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}

