package H04;

import java.awt.*;
import java.applet.*;

public class Elipses extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.RED);
        g.drawOval(20,20,80,20);
        g.fillOval(20,80,80,20);
        g.drawLine(20,30,20,90);
        g.drawLine(100,30,100,90);


        /*I DID A THING*/


    }
}


