
class WhiteBoard
{
    String Notes;
    int noofstud=0;
    int count=0;
    synchronized public void write(String something)
    {
        System.out.println("Teacher is writing "+something);
        while(count!=0)
            try{wait();}catch (Exception e){}
        Notes=something;
        count=noofstud;
        notifyAll();

    }
    synchronized public String read()
    {
        while(count==0)
            try {
                wait();
            }catch (Exception e){}
        String t=Notes;
        count--;
        if(count==0)
        {
            notify();
        }
        return t;
    }
    public void attaindence()
    {
        noofstud++;
    }

}
class Teacher extends Thread {
    WhiteBoard WB;
    String[] statement={"JAVA is a programing language","It is Object Oriented","It is platform independent","end"};
    Teacher(WhiteBoard w)
    {
        WB=w;
    }

    @Override
    public void run() {

        for (String s : statement) {
            WB.write(s);

        }

    }
}

class Student extends Thread
{
    WhiteBoard WB;
    String name;
    Student(String s,WhiteBoard w)
    {
        name=s;
        WB=w;
    }

    @Override
    public void run() {
        String note;
        WB.attaindence();

        do {
            note= WB.read();
            System.out.println(name+" reading "+note);
            System.out.flush();
        }while(!note.equals("end"));
    }
}





class TeacherStudent
{
    public static void main(String[] args) {
        WhiteBoard WB=new WhiteBoard();
        Teacher t1=new Teacher(WB);
        Student s1=new Student("AMAN",WB);
        Student s2=new Student("RMAN",WB);
        Student s3=new Student("MOHAN",WB);
        t1.start();
        s1.start();
        s2.start();
        s3.start();


    }
}