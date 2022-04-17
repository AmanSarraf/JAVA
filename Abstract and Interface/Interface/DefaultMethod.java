package Interface;

import java.util.Scanner;

class Mycellphone
{
    void dialNum(int number)
    {
        System.out.println("calling......"+number);
    }
    void pickcall()
    {
        System.out.println("connecting...........");
    }


}
interface camera
{
    void takepicture();
    void recordvideo();

}
interface wifi
{
    String[] getNetwork();
    void connect(String network);
    default void forgetNetwork()
    {
        System.out.println("Succefully forgotten default method inside WIFI ");
    }


}
interface mediaplayer
{
    void playMusic();
    void playVideo();
//    void stopMusic();
//    void stopVideo();

}

class Mysmartphone extends Mycellphone implements wifi,mediaplayer
{

     Scanner input = new Scanner(System.in);
    //defining Wifi interface

    @Override
    public void forgetNetwork() {
        System.out.println("Inside MySmartphone");
    }

    public String[] getNetwork()
     {
         System.out.println("Fetching the Available Networks");
         String[] network={"Aman6g","Tenda","LinkSyS","Hathway"};

         return network;
     }
     public void connect(String network)
     {
         System.out.println("connecting to............ "+network);

     }

     //Defining media palyer


    @Override
    public void playMusic() {

        System.out.println("------Enter the Song you want to play --------");
        String Sc=input.nextLine();
        System.out.println("Now Playing -----> "+Sc);



    }
    public void playVideo() {

        System.out.println("------Enter the Video you want to play --------");
        String Sc=input.nextLine();
        System.out.println("Now Playing -----> "+Sc);



    }

//    public void takepicture()
//    {
//        System.out.println("Picture taken and saved You look good");
//    }

}





public class DefaultMethod {
    public static void main(String[] args)
    {
        Mysmartphone S1=new Mysmartphone();
        String[] Network=S1.getNetwork();
        for (String item: Network
             ) {
            System.out.println(item);
        }

//        S1.playMusic();
//        S1.playVideo();
        //S1.connect();
        S1.forgetNetwork();

    }

}
