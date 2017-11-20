import java.awt.*;
import java.applet.*;

public class dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {


        setBackground(Color.lightGray);
        g.setColor(Color.white);
        g.fillRoundRect(80,80,200,200,90,90);


        g.setColor(Color.black);
        g.fillArc(125,125,20,20,0,360);
        g.fillArc(125,215,20,20,0,360);
        g.fillArc(215,125,20,20,0,360);
        g.fillArc(215,215,20,20,0,360);
    }
}