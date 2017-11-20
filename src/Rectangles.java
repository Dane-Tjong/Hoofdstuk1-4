package H04;

import java.awt.*;
import java.applet.*;

public class Rectangles extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.RED);
        g.drawRect(50,120,270,120); /* type what you would like to draw here */
        g.drawRoundRect(50,200,270,120,120,120);
        g.fillRect(50,40,270,120);
        g.fillRoundRect(50,280,270,120,120,120);

    }
}


