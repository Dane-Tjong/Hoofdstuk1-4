import java.awt.*;
import java.applet.*;

public class fillarc extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {


        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(80,100,300,180,0,180);

    }
    }