//Program5: Create a Base Class Person and two derived class as student and teacher with
//        their constructor and method. Assume the student to be in the same package as that of
//        person and teacher class to be in different package.
//

import pack1.*;
import pack2.*;

public class P5 {


    public static void main(String[] args) {

        Student s1 =new Student();

        Teacher t1=new Teacher();

        System.out.println("******Student's Info**********");
        s1.setName("Aman");
        s1.setAge(22);
        s1.setGrade("A++");
        s1.setIdnum(52111214);
        s1.getName();
        s1.getAge();
        System.out.println(s1.getGrade());
        System.out.println(s1.getIdnum());

        System.out.println("********Teacher Info*********");

        t1.setName("Hashirama");
        t1.setAge(1000);
        t1.getName();
        t1.getAge();

    }


}
