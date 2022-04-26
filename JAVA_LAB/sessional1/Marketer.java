
//Program4: Write an employee class Marketer to accompany the other employees.
//        Marketers make $50,000 ($10,000 more than general employees), and they have an
//        additional method named advertise that prints "Act now, while supplies last!" Use
//        the super keyword to interact with the Employee superclass as appropriate.

class Employee{
    int salary;
    Employee(){
        salary = 50000;
    }
}

class Marketers extends Employee{
    Marketers(){
        super();
        salary+=10000;
    }
    void advertise(){
        System.out.println("Act now, while supplies last!");

    }
}

public class Marketer{

    public static void main(String args[]){
        Marketers m = new Marketers();
        System.out.println(m.salary);
        m.advertise();
    }
}