class Box {
    int width;
    int height;
    int depth;
    Box(Box b)
    {
        width=b.width;
        height=b.height;
        depth=b.depth;
    }
    Box(int w, int h,int d)
    {
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }

    int volume()
    {
        return height*width*depth;
    }


}
class BoxWeight extends Box
{


}

