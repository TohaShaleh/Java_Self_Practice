package Practice_Programs;

class test extends Thread
{

    int num;
    public test(int num)
    {
        this.num=num;
    }
    @Override
    public void run()
    {
        for(int i=0;i<8;i++)
        {
            System.out.println("Hello World  "+"This is from thread : "+num);

            try{
                Thread.sleep(700);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }
}


public class Threads{
    public static void main(String[] args) {

        test t1=new test(1);
        test t2=new test(2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }


    }
}