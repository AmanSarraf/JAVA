import java.util.*;
class Car
{
  public String name;
  Public int gear;
  public float price;
  public int maxspeed;

  public void setName(String s)
  {
    
    this.name=s;  
   
  }
public void setGear(int g)
  {
    
    this.gear=g;  
   
  }
public void setPrice(float p)
  {
    
    this.price=p;  
   
  }
public void setMaxspeed(int ms)
  {
    
    this.maxspeed=ms;  
   
  }
 public void viewName()
  {
      System.out.println("The name of car is "+name);
  }
 public void viewPrice()
  {
      System.out.println("The Price of the car is  "+price);
  }
 public void viewGear()
  {
      System.out.println("The Gear set is "+gear);
  }
 public void viewMaxspeed()
  {
      System.out.println("The MaxSpeed is  "+maxspeed);
  }

}