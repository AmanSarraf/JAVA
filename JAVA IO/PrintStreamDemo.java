import java.io.*;

class Student
{
    String name;
    int roll;
    String subject;
}


public class PrintStreamDemo {
    public static void main(String[] args)throws Exception
    {
        FileOutputStream fos=new FileOutputStream("prinstreamdemo.txt");
//        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(fos));
//
//        Student t=new Student();
//        t.name="Chaman";
//        t.roll=52111214;
//        t.subject="MCA";
//
//        bw.write(t.name);
//        bw.write(t.roll);
//        bw.write(t.subject);
//


        PrintStream ps=new PrintStream(fos);
        Student s=new Student();
        s.name="Aman";
        s.roll=52111214;
        s.subject="MCA";
        ps.println(s.name);
        ps.println(s.roll);
        ps.println(s.subject);
       ps.close();
        fos.close();
        //bw.close();
        FileInputStream fis=new FileInputStream("prinstreamdemo.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));


        System.out.println(" Name="+br.readLine()+" Roll="+(Integer.parseInt(br.readLine())-2)+" Dept="+br.readLine());




    }






}
