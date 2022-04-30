package Challenge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class AbdulBari {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos1=new FileOutputStream("source1.txt");
        FileOutputStream fos2=new FileOutputStream("source2.txt");

        String str1="Hello this is for source1";
        String str2="Hello this is for source1";
        byte[] b1=str1.getBytes();
        fos1.write(b1);
        byte[] b2=str2.getBytes();
        fos2.write(b2);
        fos1.close();
        fos2.close();
        FileInputStream fis1=new FileInputStream("source1.txt");
        FileInputStream fis2=new FileInputStream("source2.txt");
        FileOutputStream fos=new FileOutputStream("destination1.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        int x;
        while ((x= sis.read())!=-1)
        {
            fos.write(x);
        }


        fis1.close();
        fis2.close();
        sis.close();







    }



}
