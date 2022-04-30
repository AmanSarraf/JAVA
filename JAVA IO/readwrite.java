import java.io.FileReader;
import java.io.FileWriter;

public class readwrite {
    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("data.txt");
        String str="This is a test message for testing FileWrite class ";
        fw.write(str);
        fw.close();
        FileReader fr=new FileReader("data.txt");
        int x;
        while((x= fr.read())!=-1)
        {


                System.out.print((char)x);

        }
    }
}
