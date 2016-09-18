import java.util.*; 
import java.io.*;

class Function {  
  public static String FirstReverse(String str) { 
       String reversed = "";
        for (int i = str.length()-1; i >=0; i--){
            reversed = reversed + str.charAt(i);
        }
       
    return reversed;  
  } 
  
  public static void main (String[] args) {  
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}