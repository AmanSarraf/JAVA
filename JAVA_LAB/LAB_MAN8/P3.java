import java.util.*;

public class P3
{
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Raghuvar");
        names.add("Hanuman");
        names.add("Lakhan");
        names.add("Sita");
        names.add("Ram");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}