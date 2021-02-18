
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Scanner scan = new Scanner(System.in);
        
        
        
        
        int count =0;
        System.out.println("enter a string");
        while (true) {
        
        String input= scan.nextLine();
        
        if (input.equalsIgnoreCase("end")){
            break;
            
            //continue;
           } 
        
        
        else  {
           count++ ; 
             
        }
        
       

    }
        
       System.out.println(count);  
    }
}

