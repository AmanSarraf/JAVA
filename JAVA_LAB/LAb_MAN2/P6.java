//Program6: WAP to add two no’s entered through command line.
public class P6 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i< args.length;i++)
        {
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println(" Result "+sum);
    }
}
