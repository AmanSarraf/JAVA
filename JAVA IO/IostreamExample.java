
import java.io.*;
import java.util.Scanner;

public class IostreamExample {
    public static void main(String[] args)throws Exception {
//        try {
////            FileOutputStream fos = new FileOutputStream("C:/Users/AMAN/OneDrive/Documents/JAVA/JAVA IO/test.txt");
////            System.out.println("Enter your String to write in file");
////            Scanner input=new Scanner(System.in);
////            String message =input.nextLine();
////            byte[] b1=message.getBytes();
//////            fos.write(b1,10,message.length()-10);
//////            for (byte x:b1
//////                 ) {
//////                fos.write(x);
//////
//////            }
////            fos.write(message.getBytes());
////            fos.close();
//
//        } catch (IOException e) {
//            System.out.println(e);
//        }
        //Readig from file
        FileInputStream fis=new FileInputStream("test.txt");
//        byte[] b2=new byte[fis.available()];
//        fis.read(b2);
//        String readfromfile=new String(b2);
//        System.out.println("reding from file.....");
//        System.out.println(readfromfile);
        int x;
        do {

            x=fis.read();
            if(x!=-1)
            {
                System.out.print((char)x);
            }
        }while(x!=-1);
fis.close();



    }
}
