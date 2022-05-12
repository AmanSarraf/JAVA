import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;

public class P4 extends Applet {

    private static final long serialVersionUID = 2530894095587089544L;

    private AudioClip clip;

    // Called by the browser or applet viewer to inform
    // this applet that it has been loaded into the system.
    public void init() {

        clip = getAudioClip(getDocumentBase(), "http://www.myserver.com/clip.au");

    }

    // Paints the container. This forwards the paint to any
    // lightweight components that are children of this container.
    public void paint(Graphics g) {

        // Start playing this audio clip. Each time this method is called,

        // the clip is restarted from the beginning.
        clip.play();

        // Stops playing this audio clip.
        clip.stop();

        // Starts playing this audio clip in a loop.
        clip.loop();

    }

}