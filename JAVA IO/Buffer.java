import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args)throws Exception {
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        char c;
        do {
            c=(char) b1.read();
            System.out.println(c);

        }while(c!='\n');
    }
}
