import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        //What if we don't know the size of Array we just want to insert array to insert as much element we want
        //Solution is ARRAY LIST which is simillar to vector<> in c++

        //Syntax

        ArrayList<Integer> list=new ArrayList<>();
//        list.add(12);
//        list.add(12);
//        list.add(12);
//        list.add(12);
//        list.add(12);
//        list.add(12);
        System.out.println(list);   ///list will have its own to string method
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }


    }
}
