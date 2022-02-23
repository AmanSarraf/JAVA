//comand line argument


public class echo
{

   public static void main(String args[])
{


int sum=0;
for(int i=0;i<args.length;i++)   // till the length of argumemts
{
  sum=sum+Integer.parseInt(args[i]);  
 } 
System.out.println("Sum is " + sum);
  
}
}