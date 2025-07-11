package Java_Special_Cases;

class A{

    public void show(){
        System.out.println("Hello from A");
    }

   // only inner class can be static
    static class B{
        public void disp(){
            System.out.println("hello from inner class\n");
        }
    }

    class C{
        public void display(){
            System.out.println("Hello from inner class C under class A");
        }
    }

}


public class inner_Class {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.show();

        A.B obj2=new A.B();
        obj2.disp();

        A.C obj3=obj1.new C();
        obj3.display();


    }
}
