//YeilPark Assignment13
//CS141
//This program reverse the line as odd and even line
import java.util.*;
import java.io.*;
public class YeilPark13{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("assignment13.txt"));
      flipLines(input);
   
   }
   public static void flipLines(Scanner input) throws FileNotFoundException{
      PrintStream output = new PrintStream (new File ("output.txt"));
      
      while(input.hasNextLine()){
         String line1 = input.nextLine();
         if(input.hasNextLine()){
            String line2 = input.nextLine();
            output.println(line2);
            output.println(line1);
         }else{
            output.println(line1);
         }
      }
   }
}