package inheritance1;
class BcaStudent extends McaStudent
{
 
  String college;
  int fee;
  
  public void setCollege(String s2)
   {
      college=s2;   
   }
  public void setFee(int f)
  { 
    fee=f;
  }
  public void showCollege()
  {
     System.out.println("  college ="+college);
  }

   public void showFee()
  {
     System.out.println("  fee ="+fee);
  }

}