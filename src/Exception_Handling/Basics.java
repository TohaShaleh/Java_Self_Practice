package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println("hello world\n");

        Scanner scanner = new Scanner(System.in);
        int val1 = 0;
        int val2 = 0;

        try{
            val1 = scanner.nextInt();
            val2 = scanner.nextInt();

            double value = val1/val2;
            System.out.println("The answer : "+value);
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero: "+ae.getMessage());
        }
        catch(InputMismatchException ime){
            System.out.println("Invalid input type: "+ime.getMessage());
        }
        catch(Exception e){
            System.out.println("An error occurred: "+e.getMessage());
        }
        finally {
            scanner.close();
        }
    }


}



