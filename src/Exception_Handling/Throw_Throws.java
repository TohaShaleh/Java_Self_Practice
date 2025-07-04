package Exception_Handling;

import java.util.Scanner;

public class Throw_Throws {
    public static void main(String[] args) {

        try{
            System.out.println("Enter your Age : ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            display(age);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void display(int age) throws Exception{
        if(age<18){
            throw new Exception("You have not permission to marry her!!\n");
        }
        else
        {
            System.out.println("Congratulations!!\nyou have permission to marry her!!\n");
        }
    }
}
