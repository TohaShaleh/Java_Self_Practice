package Design_Patterns;

interface OS{
    void show();
}


class IOS implements OS{
    @Override
    public void show()
    {
        System.out.println("It is working Secretly with ios !!");
    }
}


class windows implements OS
{
    @Override
    public void show()
    {
        System.out.println("It is common for every device");
    }
}


class nokia implements OS{
    @Override
    public void show()
    {
        System.out.println("It is basically old ");
    }
}


class factory_pattern{
    public OS getinstance(String str)
    {
        if(str=="open")
            return new windows();
        else if(str=="close")
            return new IOS();
        else
            return new nokia();
    }
}


public class Factory {

    public static void main(String[] args) {
        factory_pattern obj=new factory_pattern();
        OS instance=obj.getinstance("close");
        instance.show();

    }
}
