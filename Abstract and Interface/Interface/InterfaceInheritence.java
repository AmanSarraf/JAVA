package Interface;

interface radio
{

}
interface PlayMusic2 extends radio        // we can't have interfaces of same name in same Package
{

}

class MediaSystem implements PlayMusic2
{

}


public class InterfaceInheritence {
}
