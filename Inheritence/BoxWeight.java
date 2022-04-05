public class BoxWeight extends Box{

    private int weight;

    BoxWeight(int height,int depth,int width,int weight)
    {
        super(height,depth,width);
        //this.height=height;   not possible to access directly
        this.weight=weight;
    }
    BoxWeight()
    {
        super();
        this.weight=-1;
    }
    BoxWeight(BoxWeight ob)
    {
        super(ob);     /////  as parent can refer to child
        this.weight= ob.weight;
    }
    int volume()
    {
        return super.volume()*this.weight;
    }




}

class Run{
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(1,2,3);
        Box b3 = new Box(b2);

      //  BoxWeight bw1=new Box();
        //BoxWeight bw1=new BoxWeight(b2);
        BoxWeight bw1=new BoxWeight(1,2,3,4);
        System.out.println(bw1.volume());

    }
}
