package H04;

import java.awt.*;
import java.applet.*;

public class Line extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.RED);
        g.drawLine(50,120,270,120); /* type what you would like to draw here */

    }
}


