package Design_Patterns;

public class Singleton_pattern {

    // keeping a private constructor won't allow others to create multiple instance of this class
    private Singleton_pattern(){
        System.out.println("Instance of the Singleton class created!!\n");
    }

    private static Singleton_pattern instance=null;

    // This method ensures only one instance of the class is ever created.
    public static Singleton_pattern getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton_pattern();
        }
        return instance; // Always returns the same instance.
    }

    public void display()
    {
        System.out.println("Hello from the Singleton Class \n");
    }


}

class main {
    public static void main(String[] args) {

        Singleton_pattern ins1=Singleton_pattern.getInstance();

        Singleton_pattern ins2=Singleton_pattern.getInstance();

        ins1.display();
        System.out.println(ins1==ins2);  // ins and ins1 are pointing to the same reference

    }
}
