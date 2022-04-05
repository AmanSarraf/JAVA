class Box {
   private int width;
   private int height;
   private int depth;
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
    Box(int height)
    {
        this.width=this.depth=this.height=height;

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

