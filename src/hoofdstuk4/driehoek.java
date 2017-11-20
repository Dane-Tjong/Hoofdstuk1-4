import java.awt.*;
import java.applet.*;

public class driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.BLUE);
        g.drawLine(50,200,150,200);
        g.drawLine(50,200,100,125);
        g.drawLine(100,125,150,200);

    }
}

