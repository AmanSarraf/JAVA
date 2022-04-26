package pack2;

public class Student extends Person{

    private int Idnum;
    private String Grade;

    public void setIdnum(int idnum) {
        this.Idnum = idnum;
    }

    public void setGrade(String grade) {
        this.Grade = grade;
    }

    public int getIdnum() {
        return Idnum;
    }

    public String getGrade() {
        return Grade;
    }

    public Student()
    {
        System.out.println("this is Student in Pack2");
    }
}
