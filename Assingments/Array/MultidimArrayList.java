import java.util.ArrayList;
import java.util.Scanner;

public class MultidimArrayList
{
    public static void main(String[] args) {
//        ArrayList<ArrayList<int>> list =new ArrayList<>(); wrong dont use primitives
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();


        // Now initialisation

        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());  // this will add columns part
        }
        //add elements
        Scanner in = new Scanner(System.in);

        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                list.get(row).add(in.nextInt());
            }
        }


        //printing

        System.out.println(list);

    }
}
