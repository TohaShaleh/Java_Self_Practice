package SOLID_Principles;

/*
The following code violates ISP:

interface Workable {
    void writeCode();
    void manageTeam();
}

class Developer implements Workable {
    @Override
    public void writeCode() {
        System.out.println("Writing code...");
    }
    @Override
    public void manageTeam() {
        // This is not relevant for Developer, so this is a violation of ISP.
        System.out.println("Managing a team...");
    }
}

class Manager implements Workable {
    @Override
    public void writeCode() {
        // This is not relevant for Manager, so this is a violation of ISP.
        System.out.println("Managing a team...");
    }

    @Override
    public void manageTeam() {
        System.out.println("Managing a team...");
    }
}

*/


/*
instead of doing this we need do like the following :

Instead of forcing a class to implement irrelevant methods,
break large interfaces into multiple smaller ones that make sense for the client class.
interfaces should be segregated into smaller, focused interfaces for easier to maintain and extend.
*/



//starts here:
interface Coder {
    void writeCode();
}


interface Manager {
    void manageTeam();
}


class Developer implements Coder {
    @Override
    public void writeCode() {
        System.out.println("Writing code...");
    }
}


class ManagerEmployee implements Manager {
    @Override
    public void manageTeam() {
        System.out.println("Managing a team...");
    }
}

public class Interface_Segregation {
    public static void main(String[] args) {

        Coder developer = new Developer();
        Manager manager = new ManagerEmployee();


        developer.writeCode();
        manager.manageTeam();
    }
}

