import java.awt.*;
import java.applet.*;

public class stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

            /*frame*/
        setBackground(Color.lightGray);
        g.setColor(Color.black);
        g.fillRoundRect(100,50,100,220,50,50);
            /*lights*/
                /*red*/
        g.setColor(Color.red);
        g.fillOval(140,100,25,25);
                /*orange*/
        g.setColor(Color.orange);
        g.fillOval(140,150,25,25);
                /*green*/
        g.setColor(Color.green);
        g.fillOval(140,200,25,25);

        //dit is een single line comment


    }
}