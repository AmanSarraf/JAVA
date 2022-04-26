/* Given a list of marks ranging from 0 to 100, write a program to compute and
        print the numbers of student should have obtained marks (a) in the range 81 to 100 (b) in
        the range 61 to 80 (c) in the range 41 to 60 (d) in the range 0 to 40. The program should use
        minimum number of if statements.*/

import java.util.Scanner;

public class P4 {

    public static void printStudentNo(int[] arr)
    {
        int i,j,counta=0,countb=0,countc=0,countd=0;
        for(i = 0;i < arr.length;i++)
        {
            for(int a=0;a<arr.length;a++)
            {
                if(arr[a]>80&&arr[a]<=100)
                {
                    counta++;
                }else if(arr[a]>60&&arr[a]<=80)
                {
                    countb++;
                }else if(arr[a]>40&&arr[a]<=60)
                {
                    countc++;
                }if(arr[a]>=0&&arr[a]<=40)
                {
                    countd++;
                }
            }
        }
        System.out.println("Students in range 100 to 80 is "+counta+
                "\nStudents in Range 60 to 80 are"+countb+
                "\nStudents in Range 40 to 60 are "+countc+
                "\nStudents in Range 0 to 40 are"+countd);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int marks[50]; wrong
        int[] marks=new int[20];

        System.out.println("Enter the data");
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=input.nextInt();
        }
        printStudentNo(marks);


    }

}
