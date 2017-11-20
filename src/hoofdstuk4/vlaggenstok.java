import java.awt.*;
import java.applet.*;

public class vlaggenstok extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);

        /*pole*/
            /*pole-ovals*/
        g.drawOval(20,10,20,10);
        g.fillOval(20,240,20,10);
            /*pole lines*/
        g.drawLine(20,15,20,245);
        g.drawLine(40,15,40,245);

        /*flag*/
            /*red*/
        g.setColor(Color.RED);
        g.fillRect(40,15,120,29);
            /*white*/
        g.setColor(Color.white);
        g.fillRect(40,45,120,29);
            /*blue*/
        g.setColor(Color.BLUE);
        g.fillRect(40,75,120,29);
    }
}