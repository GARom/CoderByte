import java.util.*;
import java.io.*;

class Function {
    public static String LetterChanges(String str) {

        char[] ca = str.toCharArray();
        for(int i=0; i<ca.length; i++) {
            if(Character.isLetter(ca[i])) {
                if(ca[i] == 'z')  ca[i] = 'a';
                else if(ca[i] == 'Z') ca[i] = 'A';
                else {
                    ca[i]++;
                }

                if(ca[i]=='a' || ca[i]=='e' || ca[i]=='i' || ca[i]=='o' || ca[i]=='u')
                    ca[i] = Character.toUpperCase(ca[i]);
            }
        }

        return String.valueOf(ca);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }

}