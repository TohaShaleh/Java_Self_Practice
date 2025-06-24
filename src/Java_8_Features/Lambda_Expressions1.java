package Java_8_Features;

import java.util.ArrayList;
import java.util.*;

@FunctionalInterface
interface Myinterface{
    final static int num=10000;
    default String myMethod(){
        return "\nThis is my default method from the Anonymous Inner Class";
    }
    public static String mystaticmethod(){
        return "This is my static method ";
    }
    void print();
}


public class Lambda_Expressions1 {

    public static void main(String[] args) {

        Myinterface myinterface1 = () -> {
            System.out.println("hello Afrin!! ");
            System.out.println(Myinterface.num);
            System.out.println(Myinterface.mystaticmethod());


        };
        myinterface1.print();


        // lambdas can’t access default methods directly
        // So, we have to use Anonymous Inner Class
        Myinterface myinterface2 = new Myinterface() {
            @Override
            public void print() {
                System.out.println(this.myMethod());
            }
        };

        myinterface2.print();




    }
}
