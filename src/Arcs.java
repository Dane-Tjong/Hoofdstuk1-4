package H04;

import java.awt.*;
import java.applet.*;

public class Arcs extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.RED);
        g.drawArc(50,50,200,200,0,360);

    }
}


