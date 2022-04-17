package Interface;

public class Smartphone implements PlayMusic {

//    public void changeBool()
//    {                                  can't change
//       // PhoneName=false;
//    }
    public void doSomething(){
        if(PhoneName)
        {
            System.out.println("its switched off");
        }

    }

    public static void main(String[] args) {
        Smartphone s1=new Smartphone();
        s1.doSomething();
    }
}
