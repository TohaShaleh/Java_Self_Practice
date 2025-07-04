import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String str=input.nextLine();

        String str1=new StringBuilder(str).reverse().toString();

        System.out.println("Original: "+str+" and the reverse : "+str1);


    }

}
