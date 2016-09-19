import java.util.*;
import java.io.*;

//First approach
//class Function {
//    static boolean SimpleSymbols(String str) {
//
//        if(Character.isLetter(str.charAt(0))|| Character.isLetter(str.charAt(str.length()-1))) {
//            return false;
//        }
//        for(int x=0; x<str.length();x++) {
//            if(Character.isLetter(str.charAt(x))) {
//                if((str.charAt(x-1) != '+' || str.charAt(x+1) != '+')) {
//                        return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public static void main (String[] args) {
//
//        Scanner  s = new Scanner(System.in);
//        System.out.print(SimpleSymbols(s.nextLine()));
//
//    }
//}

//BETTER APPROACH. No need to repeat ->str.charAt() multiple times if you convert toCharArray()
//class Function {
//    static boolean SimpleSymbols(String str) {
//        char[] cc = str.toCharArray();
//
//        if(Character.isLetter(cc[0]) || Character.isLetter(cc[cc.length-1])){
//            return false; //return "false";
//        }
//        for (int i = 0; i < cc.length-1; i++){
//            if(Character.isLetter(cc[i])){
//                if(cc[i-1] != '+' || cc[i+1] != '+'){
//                    return false;//return "false";
//                }
//            }
//        }
//        return true;// return "true";
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println(SimpleSymbols(s.nextLine()));
//    }
//}

//Same as above but changed the function to String!
class Function {
    static String SimpleSymbols(String str) {
        char[] cc = str.toCharArray();

        if(Character.isLetter(cc[0]) || Character.isLetter(cc[cc.length-1])){
            return String.valueOf(false); //return "false";
        }
        for (int i = 0; i < cc.length-1; i++){
            if(Character.isLetter(cc[i])){
                if(cc[i-1] != '+' || cc[i+1] != '+'){
                    return String.valueOf(false);//return "false";
                }
            }
        }
        return String.valueOf(true);// return "true";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(SimpleSymbols(s.nextLine()));
    }
}
