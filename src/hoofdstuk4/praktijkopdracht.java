import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {


        setBackground(Color.lightGray);
        g.setColor(Color.black);

         //figures
            //line
        g.drawLine(50,20,450,20);
        g.drawString("Lijn",255,32);

            //rectangle
        g.drawRect(50,50,400,200);
        g.drawString("Rechthoek",225,261);

            //roundrectangle
        g.drawRoundRect(50,300,400,200,90,90);
        g.drawString("Afgeronde rechthoek",200,510);

            //filledrectangle
        g.setColor(Color.magenta);
        g.fillRect(500,50,400,200);
        g.setColor(Color.black);
        g.drawOval(500,50,400,200);
        g.drawString("Gevulde rechthoek met ovaal",620,260);

            //filledoval
        g.setColor(Color.magenta);
        g.fillOval(500,300,400,200);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",665,512);

            //taart
        g.setColor(Color.magenta);
        g.fillArc(950,50,400,200,0,45);
        g.setColor(Color.black);
        g.drawArc(950,50,400,200,0,360);
        g.drawString("taartpunt met ovaal eromheen",1065,262);

        //circle
        g.drawOval(1050,300,200,200);
        g.drawString("circle",1140,515);









    }
}